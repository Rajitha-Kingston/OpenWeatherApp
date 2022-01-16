# Weatherapp

Weatherapp is a simple weather forecast app, which uses some APIs to fetch 5 day / 3 hour forecast data
from the [OpenWeatherMap](https://openweathermap.org/forecast5) and to fetch places,cities,counties,coordinates etc.
from [Algolia Places](https://community.algolia.com/places/). The main goal of this app is to be a sample of how to build an high quality Android application
that uses the Architecture components, Hilt etc. in Kotlin.

## Architecture
The app uses MVVM [Model-View-ViewModel] architecture to have a unidirectional flow of data, separation of concern, testability, and a lot more.

![Architecture](https://developer.android.com/topic/libraries/architecture/images/final-architecture.png)

## Design
Inspired by [Ramonyv](https://www.uplabs.com/posts/weather-app-freebie) and weather icons taken from [isneezy/open-weather-icons](https://github.com/isneezy/open-weather-icons)
