package com.example.mvvm.androidacademy.data.repository

import com.example.mvvm.androidacademy.data.api.ApiConnector

class PhotoRepository(val apiConnector: ApiConnector) : IRepository {
    suspend fun getPhotoList() = apiConnector.getPhotoList()
}