package com.example.visaapplication.repository

import com.example.visaapplication.model.CountryVisaTypes
import com.example.visaapplication.model.database.CountryVisaTypesDao
import com.example.visaapplication.network.RetrofitModule
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class CountryVisaTypesRepo @Inject constructor(
    private val countryVisaTypesDao: CountryVisaTypesDao,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) : CountryVisaTypesRepoContract {
    suspend fun fetchCountryVisaTypes(): CountryVisaTypes {
        return RetrofitModule.countryVisaTypesApiContract.fetchCountryVisaTypes()
    }

    override suspend fun saveCountryVisaTypes(countryVisaTypes: CountryVisaTypes) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteCountryVisaTyes(countryVisaTypes: CountryVisaTypes) {
        TODO("Not yet implemented")
    }

    override suspend fun getAllCountryVisaTypes(): List<CountryVisaTypes> {
        TODO("Not yet implemented")
    }

    override suspend fun getAllCountryVisaTypesFromApi(): CountryVisaTypes {
        TODO("Not yet implemented")
    }
}