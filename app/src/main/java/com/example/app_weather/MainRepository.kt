package com.example.app_weather



class MainRepository {
    suspend fun getWeather(): WeatherData {
        return WeatherAPIService.api.getServiceAPI()
    }
}