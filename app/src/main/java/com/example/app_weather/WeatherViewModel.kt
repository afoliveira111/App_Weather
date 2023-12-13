package com.example.app_weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch



class WeatherViewModel constructor(private val repository: MainRepository) : ViewModel(){

    val resultsLiveData = MutableLiveData<WeatherData>()

    fun getWeather() {
        viewModelScope.launch{
            val response = repository.getWeather()
            resultsLiveData.postValue(response)
        }
    }
}