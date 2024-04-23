package com.example.visaapplication.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit

object RetrofitModule {
    private const val BASE_URL = "https://wb33izvlsd.execute-api.us-east-2.amazonaws.com/prod/"

    private val client: OkHttpClient =
        OkHttpClient
            .Builder()
            .connectTimeout(5, TimeUnit.SECONDS)
            .addInterceptor { chain ->
                val request = chain.request().newBuilder()
                    .addHeader("x-api-key", "kE1hmui0XV3m4yvvlIYIc6ffEZMPvWpU9Ia1drjD")
                    .build()
                chain.proceed(request)
            }
            .build()

    private val retrofit = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val countryVisaTypesApiContract : CountryVisaTypesApiContract= retrofit.create()
    val visaDetailApiContract: VisaDetailApiContract = retrofit.create()

}