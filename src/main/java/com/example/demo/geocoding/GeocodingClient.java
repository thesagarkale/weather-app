package com.example.demo.geocoding;

import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class GeocodingClient {
    private final String baseUri = "https://maps.googleapis.com/maps/api/geocode/json?address=";

    public Geocode getGeocode(String city) {
        String encodedCity = URLEncoder.encode(city, StandardCharsets.UTF_8);

        String searchString = baseUri + encodedCity;


        /*try {
            URL url = new URL(citySearchUrl + searchString);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        return new Geocode(searchString, 51.51, -51.51);
    }
}
