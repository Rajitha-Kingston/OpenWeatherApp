package com.rajitha.app.weatherapp.domain.datasource.currentWeather

import com.rajitha.app.weatherapp.domain.WeatherAppAPI
import com.rajitha.app.weatherapp.domain.model.CurrentWeatherResponse
import io.reactivex.Single
import javax.inject.Inject


class CurrentWeatherRemoteDataSource @Inject constructor(private val api: WeatherAppAPI) {

    fun getCurrentWeatherByGeoCords(lat: Double, lon: Double, units: String): Single<CurrentWeatherResponse> = api.getCurrentByGeoCords(
        lat,
        lon,
        units
    )
}
