package com.example.nbuprovalyuta.retrofit

import com.example.nbuprovalyuta.models.MyConverterItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("uz/exchange-rates/json/")
    fun getUsers(): Call<List<MyConverterItem>>
}