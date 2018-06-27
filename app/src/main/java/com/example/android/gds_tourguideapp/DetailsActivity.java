package com.example.android.gds_tourguideapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static com.example.android.gds_tourguideapp.LocationsAdapter.getDPI;

/**
 * Created by alanionita on 26/06/2018.
 */

public class DetailsActivity extends AppCompatActivity {
    // Define global variables
    WindowManager windowManager;
    DisplayMetrics metrics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details);

        // Get display metrics from windowManager
        metrics = new DisplayMetrics();
        windowManager = (WindowManager) getApplicationContext()
                .getSystemService(Context.WINDOW_SERVICE);
        windowManager.getDefaultDisplay().getMetrics(metrics);

        /**
         * Find the incoming intent data and record it to variables
         */

        int locationImage = getIntent().getIntExtra(
                getResources().getString(R.string.int_extra_image),
                0);
        String locationTitle = getIntent().getStringExtra(
                getResources().getString(R.string.int_extra_title));
        String locationDescription = getIntent().getStringExtra(
                getResources().getString(R.string.int_extra_description));

        /**
         * Find the xml placeholders and setting them to the new value
         */

        ImageView details_image = findViewById(R.id.details_image);
        TextView details_title = findViewById(R.id.details_title);
        TextView details_description = findViewById(R.id.details_description);

        if (locationImage != -1) {
            details_image.setImageResource(locationImage);
            // Set image size
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, getDPI(200, metrics));
            details_image.setLayoutParams(params);
        }
        if (locationImage == -1) {
            // Set image size
            LinearLayout.LayoutParams secondParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            details_image.setLayoutParams(secondParams);
        }
        details_title.setText(locationTitle);
        details_description.setText(locationDescription);

        /**
         * Find the close button and add a click listener that returns the
         * user to the list view
         */

        ImageButton closeButton = findViewById(R.id.close_details_button);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
