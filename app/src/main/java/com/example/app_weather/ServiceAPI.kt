package com.example.app_weather

import retrofit2.http.GET

interface ServiceAPI {
    //https://api.hgbrasil.com/weather?key=ac130002

    @GET("/weather?key=a30a6ec9")
    suspend fun getServiceAPI() : WeatherData

}