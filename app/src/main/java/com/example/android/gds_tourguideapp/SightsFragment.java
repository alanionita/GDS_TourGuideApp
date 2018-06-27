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
/**/
        // Create a list of word data
        final ArrayList<Location> sights = new ArrayList<>();
        sights.add(new Location(
                getResources().getString(R.string.anne_frank_title),
                getResources().getString(R.string.anne_frank_description),
                R.drawable.anne_frank));
        sights.add(new Location(
                getResources().getString(R.string.artis_royal_title),
                getResources().getString(R.string.artis_royal_description),
                R.drawable.artis_royal_zoo));
        sights.add(new Location(
                getResources().getString(R.string.rembrandt_title),
                getResources().getString(R.string.rembrandt_description),
                R.drawable.rembrandts));
        sights.add(new Location(
                getResources().getString(R.string.flower_markets_title),
                getResources().getString(R.string.flower_markets_description),
                R.drawable.flower_markets));
        sights.add(new Location(
                getResources().getString(R.string.royal_palace_title),
                getResources().getString(R.string.royal_palace_description),
                R.drawable.royal_palace));
        sights.add(new Location(
                getResources().getString(R.string.tussauds_title),
                getResources().getString(R.string.tussauds_description),
                R.drawable.madame_tussaud));
        sights.add(new Location(
                getResources().getString(R.string.poezenboot_title),
                getResources().getString(R.string.poezenboot_description),
                R.drawable.de_poezenboot));
        sights.add(new Location(
                getResources().getString(R.string.st_nicholas_title),
                getResources().getString(R.string.st_nicholas_description),
                R.drawable.st_nicholas_basilica));

        LocationsAdapter locationsAdapter = new LocationsAdapter(getActivity(), sights);

        ListView listView = rootView.findViewById(R.id.list);
        if (listView != null) {
            listView.setAdapter(locationsAdapter);
        }

        return rootView;

    }
}

