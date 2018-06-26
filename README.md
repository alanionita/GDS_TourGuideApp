# Google Developer Scholarship with Udacity

## TourGuide 

#### Version 1.0
[TODO: Add Screencast here]
![TourGuide v1.0]()

### Project Overview

This is an app with multiple screens, each of which lists a kind of attraction for a given city, national park, or historical monument. For instance, an app focused on Mountain View, CA might include a list of startup headquarters as well as a list of restaurants and a list of parks.

The main purpose of this project is to showcase knowledge around Fragments, ViewPagers, ListView's, and Adapters.

Also covers bitmap generation and image optimisation.

### Inspiration

A recent trip to Amsterdam where I stumbled across the 'I am Amsterdam' branding. 

One things led to another and I discovered the campaign's [website](https://www.iamsterdam.com/en/).

I loved the branding and decided to try to recreate it in an app. 

![screenshot of I am Amsterdam](https://github.com/alanionita/GDS_TourGuideApp/blob/master/readme_assets/i_am_amsterdam_screenshot.png)

Loving the simplicity of these cards and as you case above I've stolen most of the design 😀.

![card screenshot I am Amsterdam](https://github.com/alanionita/GDS_TourGuideApp/blob/master/readme_assets/i_am_amsterdam_cards.png)

### Why this project?
  
A great way to increase the complexity of the apps I'm building whilst learning best practices like Bitmap generation, image optimisation, performance, and memory management.

### What will I learn?

This project is about combining various ideas and skills we’ve been practicing throughout the course. They include:
* Deep dive into ListViews, ArrayLists, ArrayListAdapters, and custom Java classes
* Building navigation patterns using fragments and fragment adapters

### Extra challenges

* Material Design adherence when it comes to measurements, spacing, color
* Conditional view rendering
* Collapsible AppBar

### Requirements

#### Layout

##### Overall Layout

App contains at least 4 lists of relevant attractions for a location.

##### Navigation

User navigates between lists in Fragments using either a Navigation Drawer or a ViewPager plus TabLayout.

##### List Item Contents

Each list item contains information about an event, restaurant, historical site, or similar.

##### Pictures

At least one list includes pictures of the location.

##### Layout Best Practices

The code adheres to all of the following best practices:
- Text sizes are defined in sp
- Lengths are defined in dp
- Padding and margin is used appropriately, such that the views are not crammed up against each other.

#### Functionality

##### Location Object

App contains a custom object for storing location information .

##### Custom Adapter

App uses a custom adapter to populate the layout with views based on instances of the custom class.

##### String Storage

All strings are stored in the strings.xml resource file.

##### Image Storage

All images are stored as drawables.

All drawables are stored at multiple densities.

##### Errors

The code runs without errors.


#### Code Readability

##### Readability

Code is easily readable so that a fellow programmer can understand the purpose of the app.

##### Naming Conventions

All variables, methods, and resource IDs are descriptively named so that another developer reading the code can easily understand their function.

##### Formatting

The code is properly formatted:
- No unnecessary blank lines
- No unused variables or methods
- No commented out code
- The code also has proper indentation when defining variables and methods.