package com.example.visaapplication.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "countryVisaTypes")
data class CountryVisaTypes(
    val country: String,
    val created: String,
    val description: String,
    @SerializedName("eligible_countries")
    val eligibleCountries: String,
    val modified: String,
    @SerializedName("partition_key")
    val partitionKey: String,
    @SerializedName("range_key")
    val rangeKey: String,
    val status: String,
    val title: String,
    @PrimaryKey(autoGenerate = false)
    val visaUUID: String
)