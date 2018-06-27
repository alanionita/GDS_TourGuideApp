package com.example.android.gds_tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

// TODO: style the detail screen
// TODO: add on click listener that triggers another class an layout on click
// TODO: add all the content into fragments, and pass it to details screen
// TODO: refactor and clean the code, create style objects, use resources for variables
// TODO: submit the project and relax for a bit 🎉

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new NavigationAdaptor(this, getSupportFragmentManager()));

        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
