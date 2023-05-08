# Weather App
This is a JavaFx application that allows users to get the weather information for a specified location. It uses the Google Maps Platform API to retrieve the coordinates for a location and the Open Meteo API to get the weather information for that location.

### Prerequisites
Before you can run the application, you need to create a .env file from the .env.example file and add your Google Maps Platform API key.

```
cp .env.example .env
```

Open the .env file and replace YOUR_API_KEY_HERE with your Google Maps Platform API key.

```
GOOGLE_MAPS_API_KEY=YOUR_API_KEY_HERE
```

### Installation
To install the application, you first need to clone this repository:

```
git clone https://github.com/thesagarkale/weather-app.git
cd weather-app
```

Then, you need to install the dependencies using Maven:

```
mvn install
```

### Usage
To run the application, you can use the following command:

```agsl
mvn javafx:run
```

This will start the application and you can use it to get the weather information for any location.

### License
This project is licensed under the MIT License - see the LICENSE file for details.

### Acknowledgments
[Open Meteo API](https://open-meteo.com)

[Google Maps Platform](https://mapsplatform.google.com/)