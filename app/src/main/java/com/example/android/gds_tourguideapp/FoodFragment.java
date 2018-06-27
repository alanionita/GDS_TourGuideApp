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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of word data
        final ArrayList<Location> food = new ArrayList<>();
        food.add(new Location("Meatless District",
                "Bar & Kitchen, 100% vegan, Breakfast, Lunch, Dinner & Drinks" +
                        ", Take away, Organic"));
        food.add(new Location("Vegan Junk Food",
                "Cruelty free! Entirely plant-based Vegan Junk Food in Amsterdam."));
        food.add(new Location("Vegabond Store and Cafe",
                "Vegabond is an intimate lunchroom and vegan grocery store in " +
                        "the heart of Amsterdam that sells vegan essentials as well as " +
                        "delicious food!"));
        food.add(new Location("Mr & Mrs Watson",
                "Awarded Vegan Cheeses. The famous vegan cheeses by Mr. & Mrs. " +
                        "Watson are made in-house. Including a cashew brie and blue roquefort."));
        food.add(new Location("Terrazen Center",
                "Funky, family-run cafe with communal seating offering vegan " +
                        "versions of Caribbean & Japanese dishes."));
        food.add(new Location("Las Vegan",
                "Las Vegan is the world's first delivery-only vegan restaurant " +
                        "in Amsterdam. 100% plant based vegan food from our kitchen"));
        LocationsAdapter locationsAdapter = new LocationsAdapter(getActivity(), food);

        ListView listView = rootView.findViewById(R.id.list);
        if (listView != null) {
            listView.setAdapter(locationsAdapter);
        }

        return rootView;

    }
}

