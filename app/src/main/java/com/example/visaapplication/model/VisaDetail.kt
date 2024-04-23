package com.example.visaapplication.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "visaDetail")
data class VisaDetail(
    val body: String,
    val created: String,
    val description: String,
    val locale: String,
    val modified: String,
    val status: String,
    val title: String,
    val version: String,
    @SerializedName("visa_uuid")
    @PrimaryKey(autoGenerate = false)
    val uuid: String
)