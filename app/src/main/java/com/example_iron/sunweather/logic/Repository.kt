package com.example_iron.sunweather.logic

import androidx.lifecycle.liveData
import com.example_iron.sunweather.logic.model.Place
import com.example_iron.sunweather.logic.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers
import java.lang.RuntimeException

object Repository {
    fun searchPlaces(query:String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlaces(query)
            if (placeResponse.Status =="OK"){
                val places = placeResponse.Places
                Result.success(places)
            }else{
                Result.failure(RuntimeException("response status is ${placeResponse.Status}"))
            }
        }catch (e:Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}