package com.example.cw1d6edit2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Items> {
    List<Items> itemsListAdapter;
    public ItemsAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        itemsListAdapter = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.list_name, parent , false );

        Items currentItem = itemsListAdapter.get(position);

        ImageView itemImage = view.findViewById(R.id.item_image);
        TextView itemName = view.findViewById(R.id.item_name);
        TextView itemprice = view.findViewById(R.id.item_price);

        itemImage.setImageResource(currentItem.getItemimage());
        itemName.setText(currentItem.getItemname());
        itemprice.setText(currentItem.getItemprice()+"");

        return view;

    }
}