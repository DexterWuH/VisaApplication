package com.example.visaapplication.repository

import com.example.visaapplication.model.VisaDetail

interface VisaDetailRepoContract {

    suspend fun saveVisaDetail(visaDetail: VisaDetail)
    suspend fun deleteVisaDetail(visaDetail: VisaDetail)
    suspend fun getAllVisaDetail():List<VisaDetail>
    suspend fun getAllVisaDetailFromApi():VisaDetail
}