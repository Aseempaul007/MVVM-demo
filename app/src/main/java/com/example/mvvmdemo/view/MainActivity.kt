package com.example.mvvmdemo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmdemo.databinding.ActivityMainBinding
import com.example.mvvmdemo.viewModel.CityViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var viewModel: CityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        viewModel= ViewModelProvider(this).get(CityViewModel::class.java)

        viewModel.getCityData().observe(this){city->
            mainBinding.text1.text=city.name
            mainBinding.text2.text=city.population.toString()
            mainBinding.image.setImageDrawable(
                ResourcesCompat.getDrawable(resources,city.img,applicationContext.theme)
            )
        }

    }

}