package com.example.android.gds_tourguideapp;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by alanionita on 26/06/2018.
 */

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details);

        /**
         * Find the incoming intent data and record it to variables
         */

        int locationImage = getIntent().getIntExtra("location_details_image", 0);
        String locationTitle = getIntent().getStringExtra("title");
        String locationDescription = getIntent().getStringExtra("description");
        String locationAddress = getIntent().getStringExtra("address");

        /**
         * Find the xml placeholders and setting them to the new value
         */

        ImageView details_image = findViewById(R.id.details_image);
        TextView details_title = findViewById(R.id.details_title);
        TextView details_description = findViewById(R.id.details_description);
        TextView details_address = findViewById(R.id.details_address);

        if (locationImage != -1) {
            details_image.setImageResource(locationImage);
        }
        Log.i("title", locationTitle);
        details_title.setText(locationTitle);
        details_description.setText(locationDescription);
        details_address.setText(locationAddress);

        /**
         * Find the close button and add a click listener that returns the
         * user to the list view
         */

        ImageButton closeButton = (ImageButton) findViewById(R.id.close_details_button);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
