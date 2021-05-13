package com.example.mvvm.androidacademy.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    const val BASE_URL = "https://us-central1-testrest-319e0.cloudfunctions.net/"

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build() //Doesn't require the adapter
    }

    val apiService: ApiService = getRetrofit().create(ApiService::class.java)
}