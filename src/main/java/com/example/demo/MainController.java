package com.example.demo;

import com.example.demo.geocoding.Geocode;
import com.example.demo.geocoding.GeocodingClient;
import com.example.demo.openmeteo.MetaWeatherClient;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.MalformedURLException;

public class MainController {
    public Label mainLabel;

    public TextField city;

    public Text info;

    public void handleCitySelected() throws MalformedURLException {
        GeocodingClient geocodeClient = new GeocodingClient();

        Geocode geocodeCity = geocodeClient.getGeocode(city.getText());

        info.setText(geocodeCity.getName());
    }
}