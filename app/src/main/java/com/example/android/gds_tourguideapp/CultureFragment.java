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

public class CultureFragment extends Fragment {
    public CultureFragment() {

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of word data
        final ArrayList<Location> culture = new ArrayList<>();
        culture.add(new Location("Rijksmuseum", "", ""));
        culture.add(new Location("Van Gogh Museum", "", ""));
        culture.add(new Location("The Royal Theatre Carré", "", ""));
        culture.add(new Location("Museum van Loon", "", ""));
        culture.add(new Location("Maritime Museum", "", ""));

        LocationsAdapter locationsAdapter = new LocationsAdapter(getActivity(), culture);

        ListView listView = rootView.findViewById(R.id.list);
        if (listView != null) {
            listView.setAdapter(locationsAdapter);
        }

        return rootView;

    }
}

