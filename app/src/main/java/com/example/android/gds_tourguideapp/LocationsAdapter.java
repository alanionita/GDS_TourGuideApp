package com.example.android.gds_tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
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

        // Get current item from list
        final Location listItemData = getItem(position);

        if (customView == null) {
            customView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        // Find view from layout
        TextView locationTitle = (TextView) customView.findViewById(R.id.location_title);
        ImageView locationImage = (ImageView) customView.findViewById(R.id.list_item_image);
        ImageView detailsImage = (ImageView) customView.findViewById(R.id.details_image);

        final CardView list_item_card = customView.findViewById(R.id.list_item_card);

        if (listItemData != null) {
            locationTitle.setText(listItemData.getTitle());

            /**
             * Set on click listener to the play button
             */
            list_item_card.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    getContext().startActivity(
                            new Intent(getContext(), DetailsActivity.class)
                                    .putExtra("location_details_image", listItemData.getImage())
                                    .putExtra("title", listItemData.getTitle())
                                    .putExtra("description", listItemData.getDescription())
                                    .putExtra("address", listItemData.getAddress())
                    );
                }
            });

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


