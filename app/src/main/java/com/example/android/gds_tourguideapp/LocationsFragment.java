package com.example.android.gds_tourguideapp;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by alanionita on 20/06/2018.
 */

public class LocationsFragment extends Fragment {
    public LocationsFragment () {

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of word data
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Volderpark", "", ""));
        locations.add(new Location("Westerpark", "", ""));
        locations.add(new Location("The canals", "", ""));
        locations.add(new Location("Jordaan District", "", ""));
        locations.add(new Location("De Pijp neighbourhood", "", ""));
        locations.add(new Location("Albert Cuypmarkt", "", ""));
        locations.add(new Location("Leidseplein", "", ""));
        locations.add(new Location("De Negen Straatjes\n", "", ""));
        locations.add(new Location("Dam Square", "", ""));
        locations.add(new Location("Begijnhof", "", ""));

        LocationsAdapter locationsAdapter = new LocationsAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);
        if (listView != null) {
            listView.setAdapter(locationsAdapter);
        }

        return rootView;

    }
}

