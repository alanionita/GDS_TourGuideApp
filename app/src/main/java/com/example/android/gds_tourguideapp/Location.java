package com.example.android.gds_tourguideapp;

/**
 * Created by alanionita on 09/06/2018.
 */

public class Location {
    private static final int NO_IMAGE_CONTENT = -1;
    private String title;
    private String description;
    private String address;
    private int image = NO_IMAGE_CONTENT;
    private String webpage;
    private String opening_hours;

    Location(String titleParam, String descriptionParam) {
        title = titleParam;
        description = descriptionParam;
    }

    Location(String titleParam, String descriptionParam, int imageParam)
    {
        title = titleParam;
        description = descriptionParam;
        image = imageParam;
    }

    String getTitle() {
        return title;
    }

    String getDescription() {
        return description;
    }

    String getAddress() {
        return address;
    }

    int getImage() {
        return image;
    }
}
