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

    Location(String titleParam, String descriptionParam, String addressParam) {
        title = titleParam;
        description = descriptionParam;
        address = addressParam;
    }

    Location(String titleParam, String descriptionParam, String addressParam,
             int imageParam, String webpageParam, String openingHoursParam)
    {
        title = titleParam;
        description = descriptionParam;
        address = addressParam;
        image = imageParam;
        webpage = webpageParam;
        opening_hours = openingHoursParam;
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

    boolean hasImage() {
        return image != NO_IMAGE_CONTENT;
    }

    boolean hasWebpage() {
        return webpage != null;
    }

    boolean hasOpeningHours() {
        return opening_hours != null;
    }
}
