package com.example.android.gds_tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alanionita on 09/06/2018.
 */

// TODO: add on click listener that triggers another class an layout on click

public class LocationsAdapter extends ArrayAdapter<Location> {

    LocationsAdapter(@NonNull Context context, ArrayList<Location> locations) {
        super(context, 0,locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View customView = convertView;
        if (customView == null) {
            customView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        Location listItemData = getItem(position);

        TextView locationTitle = (TextView) customView.findViewById(R.id.location_title);
        TextView locationDescription = (TextView) customView.findViewById(R.id.location_description);
        TextView locationAddress = (TextView) customView.findViewById(R.id.location_address);

        if (listItemData != null) {
            locationTitle.setText(listItemData.getTitle());
            locationDescription.setText(listItemData.getDescription());
            locationAddress.setText(listItemData.getAddress());
        }
        return  customView;
    }
}
