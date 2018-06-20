package com.example.android.gds_tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;

/**
 * Created by alanionita on 20/06/2018.
 */

class NavigationAdaptor extends FragmentPagerAdapter {
    private Context CONTEXT;
    final int FRAG_COUNT = 4;

    public NavigationAdaptor(Context context, FragmentManager fm) {
        super(fm);
        CONTEXT = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new LocationsFragment();
            case 1:
                return new CultureFragment();
            case 2:
                return new FoodFragment();
            default:
                return new SightsFragment();
        }
    }

    @Override
    public int getCount() {
        return FRAG_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return CONTEXT.getString(R.string.category_locations);
            case 1:
                return CONTEXT.getString(R.string.category_culture);
            case 2:
                return CONTEXT.getString(R.string.category_food);
            default:
                return CONTEXT.getString(R.string.category_sights);
        }
    }
}