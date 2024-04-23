package com.example.visaapplication.network

import com.example.visaapplication.model.VisaDetail
import retrofit2.http.GET
import retrofit2.http.Path

interface VisaDetailApiContract {
    @GET("visadetails?action=fetch&visaUUID={visaUUID}&locale=en_US&version=v1")
    suspend fun fetchVisaDetail(@Path("visaUUID") visaUUID:String):VisaDetail
}