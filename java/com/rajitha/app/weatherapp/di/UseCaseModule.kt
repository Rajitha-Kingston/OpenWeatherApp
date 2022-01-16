package com.rajitha.app.weatherapp.di

import com.rajitha.app.weatherapp.domain.usecase.CurrentWeatherUseCase
import com.rajitha.app.weatherapp.domain.usecase.ForecastUseCase
import com.rajitha.app.weatherapp.domain.usecase.SearchCitiesUseCase
import com.rajitha.app.weatherapp.repo.CurrentWeatherRepository
import com.rajitha.app.weatherapp.repo.ForecastRepository
import com.rajitha.app.weatherapp.repo.SearchCitiesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object UseCaseModule {

    @Provides
    @Singleton
    fun provideCurrentWeatherUseCase(currentWeatherRepository: CurrentWeatherRepository) =
        CurrentWeatherUseCase(currentWeatherRepository)

    @Provides
    @Singleton
    fun provideForecastUseCase(forecastRepository: ForecastRepository) =
        ForecastUseCase(forecastRepository)

    @Provides
    @Singleton
    fun provideSearchCitiesUseCase(searchCitiesRepository: SearchCitiesRepository) =
        SearchCitiesUseCase(searchCitiesRepository)

}