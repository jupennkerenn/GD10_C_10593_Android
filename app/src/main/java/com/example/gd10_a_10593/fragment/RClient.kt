package com.example.gd10_a_10593.fragment

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RClient {


    private const val BASE_URL = "http://192.168.43.246/ci4-apiserver/public/"
    val instances: api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(api::class.java)
    }
}