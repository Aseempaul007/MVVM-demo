package com.example.mvvmdemo.viewModel

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmdemo.model.City
import com.example.mvvmdemo.model.CityDataProvider
import kotlin.math.sign

class CityViewModel: ViewModel() {

    private val cityData= MutableLiveData<City>()
    private val cities= CityDataProvider().getCities()
    private var currentIndex=0
    private val delay= 2000L

    init {
        loop()
    }

    fun getCityData():LiveData<City> = cityData

    private fun loop(){
        Handler(Looper.getMainLooper()).postDelayed({
            updateCity()
        },delay)
    }

    private fun updateCity(){
        currentIndex++
        currentIndex %= cities.size

        cityData.value= cities.get(currentIndex)

        loop()
     }
}