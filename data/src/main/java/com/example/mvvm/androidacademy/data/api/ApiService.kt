package com.example.mvvm.androidacademy.data.api

import com.example.mvvm.androidacademy.domain.PhotoInfo
import retrofit2.http.GET

interface ApiService {

    @GET("app/get_photos") // todo
    suspend fun getPhotoList(): List<PhotoInfo>

    @GET("") // todo
    suspend fun getPhoto()
}