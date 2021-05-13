package com.example.mvvm.androidacademy.data.api

import retrofit2.http.GET

interface ApiService {

    @GET("app/get_photos") // todo
    suspend fun getPhotoList()

    @GET("") // todo
    suspend fun getPhoto()
}