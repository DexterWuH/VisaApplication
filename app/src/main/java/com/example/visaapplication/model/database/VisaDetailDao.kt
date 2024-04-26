package com.example.visaapplication.model.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.visaapplication.model.VisaDetail

@Dao
interface VisaDetailDao {

    @Upsert
    suspend fun saveVisaDetail(visaDetail: VisaDetail)

    @Delete
    suspend fun deleteVisaDetail(visaDetail: VisaDetail)

    @Query("SELECT * FROM visaDetail")
    suspend fun getVisaDetail(): List<VisaDetail>
}