package com.example.android.gds_tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alanionita on 09/06/2018.
 */

// TODO: add on click listener that triggers another class an layout on click

public class LocationsAdapter extends ArrayAdapter<Location> {

    // Define global variables
    WindowManager windowManager;
    DisplayMetrics metrics;

    LocationsAdapter(@NonNull Context context, ArrayList<Location> locations) {
        super(context, 0,locations);

        // Get display metrics from windowManager
        metrics = new DisplayMetrics();
        windowManager = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        windowManager.getDefaultDisplay().getMetrics(metrics);
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

        // Get current item from list
        Location listItemData = getItem(position);

        // Find view from layout
        TextView locationTitle = (TextView) customView.findViewById(R.id.location_title);
        ImageView locationImage = (ImageView) customView.findViewById(R.id.list_item_image);

        if (listItemData != null) {
            locationTitle.setText(listItemData.getTitle());

            // If current item features an image
            if(listItemData.getImage() != -1) {

                // Set the image resource
                locationImage.setImageResource(listItemData.getImage());

                // Set the image size
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, getDPI(200, metrics));
                locationImage.setLayoutParams(params);
            }

            // If current item doesn't have an image
            if(listItemData.getImage() == -1) {

                // Set image size
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                locationImage.setLayoutParams(params);
            }

        }
        return  customView;


    }

    // Used for LayoutParams conversion
    public static int getDPI(int size, DisplayMetrics metrics){
        return (size * metrics.densityDpi) / DisplayMetrics.DENSITY_DEFAULT;
    }
}


