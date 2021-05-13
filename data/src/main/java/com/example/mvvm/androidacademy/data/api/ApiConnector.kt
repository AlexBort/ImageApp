package com.example.mvvm.androidacademy.data.api

class ApiConnector(val apiService: ApiService) {
    suspend fun getPhotoList() = apiService.getPhotoList()
}