package com.example.archit.tourguide;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by archit on 2/8/17.
 */

public class DataAdapter extends ArrayAdapter<data> {
    public DataAdapter(Context context, ArrayList<data> data) {
        super(context, 0, data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        data item = getItem(position);
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView image = listItemView.findViewById(R.id.image);
        TextView name_TextView = listItemView.findViewById(R.id.name_TextView);
        TextView description_TextView = listItemView.findViewById(R.id.description_TextView);
        TextView phone_TextView = listItemView.findViewById(R.id.phone_TextView);
        TextView timing_TextView = listItemView.findViewById(R.id.timing_TextView);
        TextView address_TextView = listItemView.findViewById(R.id.address_TextView);

        name_TextView.setText(item.getName());
        description_TextView.setText(item.getDescription());
        address_TextView.setText(item.getAddress());
        phone_TextView.setText(item.getPhone());
        timing_TextView.setText(item.getTiming());
        image.setImageResource(item.getImageResourceId());


        return listItemView;
    }
}
