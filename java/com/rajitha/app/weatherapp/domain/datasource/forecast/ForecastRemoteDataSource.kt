package com.rajitha.app.weatherapp.domain.datasource.forecast

import com.rajitha.app.weatherapp.domain.WeatherAppAPI
import com.rajitha.app.weatherapp.domain.model.ForecastResponse
import io.reactivex.Single
import javax.inject.Inject


class ForecastRemoteDataSource @Inject constructor(private val api: WeatherAppAPI) {

    fun getForecastByGeoCords(lat: Double, lon: Double, units: String): Single<ForecastResponse> = api.getForecastByGeoCords(
        lat,
        lon,
        units
    )
}
