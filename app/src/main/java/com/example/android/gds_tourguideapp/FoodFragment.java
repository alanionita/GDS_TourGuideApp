package com.example.android.gds_tourguideapp;

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
        food.add(new Location("Meatless District", "", ""));
        food.add(new Location("Vegan Junk Food", "", ""));
        food.add(new Location("Vegabond Store and Cafe", "", ""));
        food.add(new Location("Mr & Mrs Watson", "", ""));
        food.add(new Location("Vegan Junk Food Bar", "", ""));
        food.add(new Location("Spelde", "", ""));
        food.add(new Location("Terrazen Center", "", ""));
        food.add(new Location("Las Vegan", "", ""));
        food.add(new Location("Ekoplazza", "", ""));

        LocationsAdapter locationsAdapter = new LocationsAdapter(getActivity(), food);

        ListView listView = rootView.findViewById(R.id.list);
        if (listView != null) {
            listView.setAdapter(locationsAdapter);
        }

        return rootView;

    }
}

