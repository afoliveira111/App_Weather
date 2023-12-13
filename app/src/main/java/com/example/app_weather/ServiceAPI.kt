package com.example.app_weather

import retrofit2.http.GET

interface ServiceAPI {
    //https://api.hgbrasil.com/weather?key=ac130002

    @GET("/weather?key=ac130002")
    suspend fun getServiceAPI() : WeatherData

}