package com.example.app_weather

import com.example.weatherapp.model.Results
import com.example.weatherapp.model.WeatherData
import com.example.weatherapp.service.WeatherAPIService
import retrofit2.Call

class MainRepository {
    suspend fun getWeather(): WeatherData {
        return WeatherAPIService.api.getServiceAPI()
    }
}