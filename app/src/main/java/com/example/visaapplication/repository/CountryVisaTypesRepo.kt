package com.example.visaapplication.repository

import com.example.visaapplication.model.CountryVisaTypes
import com.example.visaapplication.network.RetrofitModule

class CountryVisaTypesRepo {
    suspend fun fetchCountryVisaTypes(): CountryVisaTypes{
        return RetrofitModule.countryVisaTypesApiContract.fetchCountryVisaTypes()
    }
}