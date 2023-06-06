package com.example.mvvmdemo.model

import com.example.mvvmdemo.R

class CityDataProvider {

    private val cities = arrayListOf<City>()

    init {
        cities.add(City("Bankkok", R.drawable.bangkok,13_00_000))
        cities.add(City("Beijing", R.drawable.beijing,14_00_000 ))
        cities.add(City("London", R.drawable.london,15_00_000))
        cities.add(City("NewYork", R.drawable.newyork,14_00_000))
        cities.add(City("Paris", R.drawable.paris,15_00_000))
        cities.add(City("Rio", R.drawable.rio,16_00_000))
        cities.add(City("Rome", R.drawable.rome,17_00_000))
        cities.add(City("Singapore", R.drawable.singapore,18_00_000))
        cities.add(City("Sydney", R.drawable.sydney,19_00_000))
        cities.add(City("Tokyo", R.drawable.tokyo,20_00_000))
    }

    fun getCities():List<City>{
        return cities
    }
}