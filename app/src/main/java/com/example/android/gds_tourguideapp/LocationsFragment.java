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
        locations.add(new Location("Volderpark",
                "The Vondelpark is a public urban park of 47 hectares (120 acres) in" +
                        " Amsterdam, Netherlands. It is part of the borough of Amsterdam-Zuid and " +
                        "situated west from the Leidseplein and the Museumplein. The park was opened" +
                        " in 1865 and originally named the \"Nieuwe Park\", but later renamed " +
                        "to \"Vondelpark\", after the 17th-century playwright " +
                        "and poet Joost van den Vondel. Yearly, the park has around 10 million visitors. " +
                        "In the park is an open-air theatre, a playground and several horeca facilities.",
                R.drawable.vondel_park));
        locations.add(new Location("Westerpark",
                "Adjacent to the centre lies the lively Westerpark neighbourhood, part of Amsterdam West. " +
                        "Home to the eponymous park, which combines expansive greenery with the Westergasfabriek's " +
                        "wealth of cultural goings on, this lively neighbourhood is home to a varied mix of independent shops, " +
                        "old-school street markets, shiny new restaurants and traditional brown cafés.",
                R.drawable.wester_park));
        locations.add(new Location("The canals", "Alongside wooden clogs, windmills, and tulips, the Amsterdam " +
                "Canals spring to mind when anyone mentions Holland. A canal cruise along the Amsterdam Canals is undoubtedly the number one" +
                " attraction and for first time visitors like me, a canal cruise is a great introduction to the city. The Amsterdam Canals also " +
                "celebrate their 400th birthday in 2013 and many special events and festivals are helping the city celebrate.",
                R.drawable.canals));
        locations.add(new Location("Jordaan District", "The Jordaan is a district in the citycenter of Amsterdam, known for " +
                "its beautiful houses, nice restaurants and original shops. When in Amsterdam, it is a must to stroll through the little streets and " +
                "canals. On the many bridges over the canals, you can take beautiful pictures and see why Amsterdam is called the Venice of the North. " +
                "Popular streets in the Jordaan are the Prinsengracht, the Westerstraat, Haarlemmerstraat and the '9 straatjes' (nine little streets).",
                R.drawable.jordaan));
        locations.add(new Location("Albert Cuypmarkt", "The Albert Cuyp Market is a street market in Amsterdam, The Netherlands, " +
                "on the Albert Cuypstraat between Ferdinand Bolstraat and Van Woustraat, in the De Pijp area of the Oud-Zuid district of the city.",
                R.drawable.albert_cuypstraat));
        locations.add(new Location("Leidseplein", "Leidseplein is a busy square at the southern end of Amsterdam's central canal ring," +
                " almost facing the popular Vondelpark.",
                R.drawable.leidseplein));
        locations.add(new Location("Begijnhof", "The Begijnhof is one of the oldest hofjes in Amsterdam, Netherlands. A group of historic" +
                " buildings, mostly private dwellings, centre on it. Today it is also the site of two churches, the Catholic Houten Huys and the English Reformed" +
                " Church.",
                R.drawable.begijnhof));

        LocationsAdapter locationsAdapter = new LocationsAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);
        if (listView != null) {
            listView.setAdapter(locationsAdapter);
        }

        return rootView;

    }
}

