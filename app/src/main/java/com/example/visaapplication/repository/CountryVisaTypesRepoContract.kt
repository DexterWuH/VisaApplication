package com.example.visaapplication.repository

import com.example.visaapplication.model.CountryVisaTypes

interface CountryVisaTypesRepoContract {

    suspend fun saveCountryVisaTypes(countryVisaTypes: CountryVisaTypes)
    suspend fun deleteCountryVisaTyes(countryVisaTypes: CountryVisaTypes)
    suspend fun getAllCountryVisaTypes(): List<CountryVisaTypes>
    suspend fun getAllCountryVisaTypesFromApi(): CountryVisaTypes
}