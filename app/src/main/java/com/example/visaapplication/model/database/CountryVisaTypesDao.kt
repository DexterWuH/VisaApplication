package com.example.visaapplication.model.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.visaapplication.model.CountryVisaTypes

@Dao
interface CountryVisaTypesDao {

    @Upsert
    suspend fun saveCountryVisaTypesDao(countryVisaTypes: CountryVisaTypes)

    @Delete
    suspend fun deleteCountryVisaTypesDao(countryVisaTypes: CountryVisaTypes)

    @Query("SELECT * FROM CountryVisaTypes")
    suspend fun getCountryVisaTypes(): List<CountryVisaTypes>

}