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

public class SightsFragment extends Fragment {
    public SightsFragment() {}
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of word data
        final ArrayList<Location> sights = new ArrayList<>();
        sights.add(new Location("Anne Frank House", "", ""));
        sights.add(new Location("Artis Royal Zoo", "", ""));
        sights.add(new Location("Rembrandt House", "", ""));
        sights.add(new Location("Flower Market", "", ""));
        sights.add(new Location("Royal Palace of Amsterdam", "", ""));
        sights.add(new Location("Madame Tussaud’s", "", ""));
        sights.add(new Location("De Poezenboot", "", ""));
        sights.add(new Location("Basilica of St. Nicholas", "", ""));

        LocationsAdapter locationsAdapter = new LocationsAdapter(getActivity(), sights);

        ListView listView = rootView.findViewById(R.id.list);
        if (listView != null) {
            listView.setAdapter(locationsAdapter);
        }

        return rootView;

    }
}

