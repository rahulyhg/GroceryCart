package com.creative.grocerycart.viewholder;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;

import com.creative.grocerycart.R;
import com.creative.grocerycart.listener.GroceryStatusChangeListener;
import com.creative.grocerycart.populators.GroceryItem;

public class GroceryItemHolder extends RecyclerView.ViewHolder {

    private CheckBox cbItem;

    public GroceryItemHolder(@NonNull View itemView) {
        super(itemView);
        cbItem = itemView.findViewById(R.id.cb_grocery_item);
    }

    public void onBind(GroceryItem groceryItem) {
        cbItem.setText(groceryItem.getItemName());
        cbItem.setChecked(groceryItem.isChecked());
        cbItem.setTag(groceryItem.getItemId());
        if (cbItem.isChecked())
            cbItem.setBackgroundColor(itemView.getContext().getResources().getColor(R.color.colorDimmed));
        else
            cbItem.setBackgroundColor(itemView.getContext().getResources().getColor(android.R.color.white));
    }

    public void setGroceryStatusListener(GroceryStatusChangeListener changeListener) {
        cbItem.setOnCheckedChangeListener(changeListener);
    }
}
