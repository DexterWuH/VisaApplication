package com.example.visaapplication.model.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.visaapplication.model.VisaDetail

@Database(entities = [VisaDetail::class], version=1)
abstract class VisaDetailDatabase:RoomDatabase() {

    abstract val visaDetailDao:VisaDetailDao

    companion object{

        @Volatile
        private var INSTANCE:VisaDetailDatabase? = null
        fun getVisaDetailDatabase(context: Context):VisaDetailDatabase{
            return INSTANCE?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    VisaDetailDatabase::class.java,
                    "note_visaDetailDatabase"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}