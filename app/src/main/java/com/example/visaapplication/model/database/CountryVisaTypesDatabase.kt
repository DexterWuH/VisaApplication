package com.example.visaapplication.model.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.visaapplication.model.CountryVisaTypes

@Database(entities = [CountryVisaTypes::class], version = 1)
abstract class CountryVisaTypesDatabase : RoomDatabase() {

    abstract val countryVisaTypesDao: CountryVisaTypesDao

    companion object {

        @Volatile
        private var INSTANCE: CountryVisaTypesDatabase? = null

        fun getCountryVisaTypeDatabase(context: Context): CountryVisaTypesDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CountryVisaTypesDatabase::class.java,
                    "note_CountryVisaTypeDatabase"
                ).build()
                INSTANCE = instance
                instance
            }

        }
    }
}