package com.example.mvvm.androidacademy.domain

import com.google.gson.annotations.SerializedName

data class PhotoInfo(val id: String, val height: Int, val adult: Boolean, val width: Int,
                     @SerializedName("member_id") val memberId: String, @SerializedName("event_id") val eventId: String, val ratio: Double, val reported: String)
