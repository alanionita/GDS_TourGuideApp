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

public class CultureFragment extends Fragment {
    public CultureFragment() {

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of word data
        final ArrayList<Location> culture = new ArrayList<>();
        culture.add(new Location(
                getResources().getString(R.string.rijksmuseum_title),
                getResources().getString(R.string.rijksmuseum_description),
                R.drawable.rijksmuseum));
        culture.add(new Location(
                getResources().getString(R.string.van_gogh_title),
                getResources().getString(R.string.van_gogh_description),
                R.drawable.van_gogh));
        culture.add(new Location(
                getResources().getString(R.string.carre_title),
                getResources().getString(R.string.carre_description),
                R.drawable.carre));
        culture.add(new Location(
                getResources().getString(R.string.van_loon_title),
                getResources().getString(R.string.van_loon_description),
                R.drawable.van_loon_museum));
        culture.add(new Location(
                getResources().getString(R.string.maritime_title),
                getResources().getString(R.string.maritime_description),
                R.drawable.maritime_museum));

        LocationsAdapter locationsAdapter = new LocationsAdapter(getActivity(), culture);

        ListView listView = rootView.findViewById(R.id.list);
        if (listView != null) {
            listView.setAdapter(locationsAdapter);
        }

        return rootView;

    }
}

