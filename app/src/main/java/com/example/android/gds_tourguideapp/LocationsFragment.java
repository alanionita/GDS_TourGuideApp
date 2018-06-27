package com.example.android.gds_tourguideapp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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
        locations.add(new Location(
                getResources().getString(R.string.volderpark_title),
                getResources().getString(R.string.volderpark_description),
                R.drawable.vondel_park));
        locations.add(new Location(
                getResources().getString(R.string.westerpark_title),
                getResources().getString(R.string.westerpark_description),
                R.drawable.wester_park));
        locations.add(new Location(
                getResources().getString(R.string.canals_title),
                getResources().getString(R.string.canals_description),
                R.drawable.canals));
        locations.add(new Location(
                getResources().getString(R.string.jordaan_title),
                getResources().getString(R.string.jordaan_description),
                R.drawable.jordaan));
        locations.add(new Location(
                getResources().getString(R.string.albert_cuypmarkt_title),
                getResources().getString(R.string.albert_cuypmarkt_description),
                R.drawable.albert_cuypstraat));
        locations.add(new Location(
                getResources().getString(R.string.leidseplein_title),
                getResources().getString(R.string.leidseplein_description),
                R.drawable.leidseplein));
        locations.add(new Location(
                getResources().getString(R.string.begijnhof_title),
                getResources().getString(R.string.begijnhof_description),
                R.drawable.begijnhof));

        LocationsAdapter locationsAdapter = new LocationsAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);
        if (listView != null) {
            listView.setAdapter(locationsAdapter);
        }

        return rootView;

    }
}

