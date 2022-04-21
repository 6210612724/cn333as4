package com.example.unitconverter.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.unitconverter.R

sealed class Screen(
    val route: String,
    @StringRes val label: Int,
    @DrawableRes val icon: Int

){

    companion object{
        val screens = listOf(Temperature,Distance,Mass)
    }


    private object Temperature: Screen(
        route = "temperature",
        R.string.temperature,
        R.drawable.device_thermostat
    )

    private  object Distance : Screen(
        route = "distance",
        R.string.distance,
        R.drawable.square_foot

    )

    private  object Mass : Screen(
        route = "mass",
        R.string.mass,
        R.drawable.fitness_center

    )
}
