package com.example.android.gds_tourguideapp;

/**
 * Created by alanionita on 09/06/2018.
 */

public class Location {
    private static final int NO_IMAGE_CONTENT = - 1;
    private String title;
    private String description;
    private String address;
    private int image = NO_IMAGE_CONTENT;
    private String webpage;
    private String opening_hours;

    Location (String titleParam, String descriptionParam, String addressParam) {
        title = titleParam;
        description = descriptionParam;
        address = addressParam;
    }

    Location (String title, String description, String address, int image, String webpage, String opening_hours) {
        title = title;
        description = description;
        address = address;
        image = image;
        webpage = webpage;
        opening_hours = opening_hours;
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

    String getWebpage() {
        return webpage;
    }

    String getOpening_hours() {
        return opening_hours;
    }

    boolean hasImage () {
        return  image != NO_IMAGE_CONTENT;
    }

    boolean hasWebpage () {
        return webpage != null;
    }

    boolean hasOpeningHours () {
        return opening_hours != null;
    }
}
