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
        sights.add(new Location("Anne Frank House",
                "The Anne Frank House is a writer's house and biographical museum" +
                        " dedicated to Jewish wartime diarist Anne Frank. The building is " +
                        "located on a canal called the Prinsengracht, close to the Westerkerk, " +
                        "in central Amsterdam in the Netherlands",
                R.drawable.anne_frank));
        sights.add(new Location("Artis Royal Zoo",
                "Artis, short for Natura Artis Magistra, is a zoo in the centre" +
                        " of Amsterdam. It is the oldest zoo in the Netherlands and one of the" +
                        " oldest zoos of mainland Europe",
                R.drawable.artis_royal_zoo));
        sights.add(new Location("Rembrandt House",
                "The Rembrandt House Museum is a historic house and art museum " +
                        "in Amsterdam in the Netherlands. Painter Rembrandt lived and worked " +
                        "in the house between 1639 and 1656.",
                R.drawable.rembrandts));
        sights.add(new Location("Flower Markets", "The flower market of" +
                " Amsterdam is a particularly colorful place in the city. You will find there" +
                " all sorts of tulips, narcissus, geraniums and many other types of flowers.",
                R.drawable.flower_markets));
        sights.add(new Location("Royal Palace of Amsterdam", "The Royal" +
                " Palace of Amsterdam in Amsterdam is one of three palaces in the Netherlands" +
                " which are at the disposal of the monarch by Act of Parliament.",
                R.drawable.royal_palace));
        sights.add(new Location("Madame Tussauds", "Madame Tussauds is" +
                " a wax museum in London with smaller museums in a number of other major " +
                "cities. It was founded by wax sculptor Marie Tussaud.",
                R.drawable.madame_tussaud));
        sights.add(new Location("De Poezenboot", "The Catboat is the" +
                " only animal sanctuary that literally floats. A refuge for stray and abandoned" +
                " cats which, thanks to its unique location on a houseboat in Amsterdam's " +
                "picturesque canal belt, has also become a world-famous tourist attraction. " +
                "The one and only Catboat.",
                R.drawable.de_poezenboot));
        sights.add(new Location("Basilica of St. Nicholas", "The " +
                "Basilica of Saint Nicholas is located in the Old Centre district of " +
                "Amsterdam, Netherlands. It is the city's major Catholic church.",
                R.drawable.st_nicholas_basilica));

        LocationsAdapter locationsAdapter = new LocationsAdapter(getActivity(), sights);

        ListView listView = rootView.findViewById(R.id.list);
        if (listView != null) {
            listView.setAdapter(locationsAdapter);
        }

        return rootView;

    }
}

