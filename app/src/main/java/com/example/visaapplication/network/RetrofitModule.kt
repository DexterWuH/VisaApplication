package com.example.visaapplication.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitModule {
    private const val BASE_URL = "https://wb33izvlsd.execute-api.us-east-2.amazonaws.com/prod/"

    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private val client: OkHttpClient =
        OkHttpClient
            .Builder()
            .connectTimeout(0, TimeUnit.SECONDS)
            .addInterceptor(loggingInterceptor)
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

    val countryVisaTypesApiContract: CountryVisaTypesApiContract =
        retrofit.create(CountryVisaTypesApiContract::class.java)
    val visaDetailApiContract: VisaDetailApiContract =
        retrofit.create(VisaDetailApiContract::class.java)

}