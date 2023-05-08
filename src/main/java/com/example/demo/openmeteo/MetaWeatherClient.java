package com.example.demo.openmeteo;

import org.json.*;

import javax.net.ssl.HttpsURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class MetaWeatherClient {
    public String citySearchUrl = "https://www.metaweather.com/api/location/search/?query=";

    public String weatherDataUrl = "https://www.metaweather.com/api/location/";

    public String getWoeid (String searchString) throws MalformedURLException {
        try {
            URL url = new URL(citySearchUrl + searchString);

            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            conn.connect();

            StringBuilder info = new StringBuilder();

            Scanner scanner = new Scanner(url.openStream());

            while (scanner.hasNext()) {
                info.append(scanner.nextLine());
            }

            scanner.close();

            System.out.println(info);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

    public JSONObject getWeatherInfo (String woeId) {
        return new JSONObject();
    }
}
