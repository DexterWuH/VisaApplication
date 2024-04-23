package com.example.visaapplication.repository

import com.example.visaapplication.model.VisaDetail
import com.example.visaapplication.network.RetrofitModule

class VisaDetailRepo {
    suspend fun fetchVisaDetail(visaUUID: String):VisaDetail{
        return RetrofitModule.visaDetailApiContract.fetchVisaDetail(visaUUID)
    }
}