package com.example.app_weather

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class ViewModelFactory(
    private val repository: MainRepository
)  : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return WeatherViewModel(repository) as T
    }
}