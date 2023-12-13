package com.example.app_weather

import retrofit2.http.GET

interface ServiceAPI {
    //https://api.hgbrasil.com/weather?woeid=455825

    @GET("/weather?woeid=455825")
    suspend fun getServiceAPI() : WeatherData




}

