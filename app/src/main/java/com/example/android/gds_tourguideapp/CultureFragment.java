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
        culture.add(new Location("Rijksmuseum", "The Rijksmuseum is a " +
                "Dutch national museum dedicated to arts and history in Amsterdam.",
                R.drawable.rijksmuseum));
        culture.add(new Location("Van Gogh Museum", "The Van Gogh Museum" +
                " is an art museum dedicated to the works of Vincent van Gogh and his " +
                "contemporaries in Amsterdam in the Netherlands.",
                R.drawable.van_gogh));
        culture.add(new Location("The Royal Theatre Carré", "The Royal " +
                "Theatre Carré is a Neo-Renaissance theatre in Amsterdam, located near the " +
                "river Amstel.",
                R.drawable.carre));
        culture.add(new Location("Museum van Loon", "Museum Van Loon is " +
                "a museum located in a canalside house alongside the Keizersgracht in " +
                "Amsterdam, Netherlands.",
                R.drawable.van_loon_museum));
        culture.add(new Location("Maritime Museum", "The National " +
                "Maritime Museum is a maritime museum in Amsterdam in the Netherlands. The " +
                "museum had 419,060 visitors in 2012. It ranked as 11th most visited museum " +
                "in the Netherlands in 2013.",
                R.drawable.maritime_museum));

        LocationsAdapter locationsAdapter = new LocationsAdapter(getActivity(), culture);

        ListView listView = rootView.findViewById(R.id.list);
        if (listView != null) {
            listView.setAdapter(locationsAdapter);
        }

        return rootView;

    }
}

