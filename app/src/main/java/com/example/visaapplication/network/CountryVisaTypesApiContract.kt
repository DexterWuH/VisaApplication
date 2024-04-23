package com.example.visaapplication.network

import com.example.visaapplication.model.CountryVisaTypes
import retrofit2.http.GET

interface CountryVisaTypesApiContract {
    @GET("visas?action=fetchAll&country=usa&locale=en_US")
    suspend fun fetchCountryVisaTypes():CountryVisaTypes
}