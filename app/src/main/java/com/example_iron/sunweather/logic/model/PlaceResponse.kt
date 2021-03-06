package com.example_iron.sunweather.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(val Status:String,val Places:List<Place>)

data class Place(val name:String, val location:Location,
@SerializedName("formatted_address") val address:String)

data class Location(val lng:String,val lat :String)