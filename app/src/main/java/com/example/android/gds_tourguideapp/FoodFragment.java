package com.example.android.gds_tourguideapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by alanionita on 20/06/2018.
 */

public class FoodFragment extends Fragment {
    public FoodFragment() {}
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of word data
        final ArrayList<Location> food = new ArrayList<>();
        food.add(new Location(
                getResources().getString(R.string.meatless_district_title),
                getResources().getString(R.string.meatless_district_description)));
        food.add(new Location(
                getResources().getString(R.string.vegan_junk_food_title),
                getResources().getString(R.string.vegan_junk_food_description)));
        food.add(new Location(
                getResources().getString(R.string.vegabond_title),
                getResources().getString(R.string.vegabond_description)));
        food.add(new Location(
                getResources().getString(R.string.mr_mrs_watson_title),
                getResources().getString(R.string.mr_mrs_watson_description)));
        food.add(new Location(
                getResources().getString(R.string.terrazen_title),
                getResources().getString(R.string.terrazen_description)));
        food.add(new Location(
                getResources().getString(R.string.las_vegan_title),
                getResources().getString(R.string.las_vegan_description)));
        LocationsAdapter locationsAdapter = new LocationsAdapter(getActivity(), food);

        ListView listView = rootView.findViewById(R.id.list);
        if (listView != null) {
            listView.setAdapter(locationsAdapter);
        }

        return rootView;

    }
}

