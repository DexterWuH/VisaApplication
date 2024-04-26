package com.example.visaapplication.repository

import com.example.visaapplication.model.VisaDetail
import com.example.visaapplication.model.database.VisaDetailDao
import com.example.visaapplication.network.RetrofitModule
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class VisaDetailRepo @Inject constructor(
    private val visaDetailDao: VisaDetailDao,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
):VisaDetailRepoContract {
    suspend fun fetchVisaDetail(visaUUID: String):VisaDetail{
        return RetrofitModule.visaDetailApiContract.fetchVisaDetail(visaUUID)
    }

    override suspend fun saveVisaDetail(visaDetail: VisaDetail) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteVisaDetail(visaDetail: VisaDetail) {
        TODO("Not yet implemented")
    }

    override suspend fun getAllVisaDetail(): List<VisaDetail> {
        TODO("Not yet implemented")
    }

    override suspend fun getAllVisaDetailFromApi(): VisaDetail {
        TODO("Not yet implemented")
    }
}