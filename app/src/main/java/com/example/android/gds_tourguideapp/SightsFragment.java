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

public class SightsFragment extends Fragment {
    public SightsFragment() {}
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of word data
        final ArrayList<Location> sights = new ArrayList<>();
        sights.add(new Location("Anne Frank House", "", "",
                R.drawable.anne_frank, "", ""));
        sights.add(new Location("Artis Royal Zoo", "", "",
                R.drawable.artis_royal_zoo, "", ""));
        sights.add(new Location("Rembrandt House", "", "",
                R.drawable.rembrandts, "", ""));
        sights.add(new Location("Flower Market", "", "",
                R.drawable.flower_markets, "", ""));
        sights.add(new Location("Royal Palace of Amsterdam", "", "",
                R.drawable.royal_palace, "", ""));
        sights.add(new Location("Madame Tussaud’s", "", "",
                R.drawable.madame_tussaud, "", ""));
        sights.add(new Location("De Poezenboot", "", "",
                R.drawable.de_poezenboot, "", ""));
        sights.add(new Location("Basilica of St. Nicholas", "", "",
                R.drawable.st_nicholas_basilica, "", ""));

        LocationsAdapter locationsAdapter = new LocationsAdapter(getActivity(), sights);

        ListView listView = rootView.findViewById(R.id.list);
        if (listView != null) {
            listView.setAdapter(locationsAdapter);
        }

        return rootView;

    }
}

