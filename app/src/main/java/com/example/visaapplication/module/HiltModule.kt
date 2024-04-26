package com.example.visaapplication.module

import android.content.Context
import androidx.room.Room
import com.example.visaapplication.model.database.CountryVisaTypesDao
import com.example.visaapplication.model.database.CountryVisaTypesDatabase
import com.example.visaapplication.model.database.VisaDetailDao
import com.example.visaapplication.model.database.VisaDetailDatabase
import com.example.visaapplication.repository.CountryVisaTypesRepo
import com.example.visaapplication.repository.CountryVisaTypesRepoContract
import com.example.visaapplication.repository.VisaDetailRepo
import com.example.visaapplication.repository.VisaDetailRepoContract
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class HiltModule {

    @Singleton
    @Provides
    fun provideVisaDetailDataBase(@ApplicationContext context: Context): VisaDetailDatabase {
        return Room.databaseBuilder(
            context,
            VisaDetailDatabase::class.java,
            "my_VisaDetailDatabase"
        ).build()
    }

    @Singleton
    @Provides
    fun provideVisaDetailDao(visaDatabase: VisaDetailDatabase): VisaDetailDao {
        return visaDatabase.visaDetailDao
    }

    @Singleton
    @Provides
    fun provideCountryVisaTypesDataBase(@ApplicationContext context: Context): CountryVisaTypesDatabase {
        return Room.databaseBuilder(
            context,
            CountryVisaTypesDatabase::class.java,
            "my_CountryVisaTypeDatabase"
        ).build()
    }

    @Singleton
    @Provides
    fun provideCountryVisaTypeDetailDao(countryVisaTypesdatabase: CountryVisaTypesDatabase): CountryVisaTypesDao {
        return countryVisaTypesdatabase.countryVisaTypesDao
    }

    @Singleton
    @Provides
    fun provideDispatcherIO(): CoroutineDispatcher {
        return Dispatchers.IO
    }

    @Singleton
    @Provides
    fun provideVisaDetailRepo(
        visaDetailDao: VisaDetailDao,
        dispatcher: CoroutineDispatcher
    ): VisaDetailRepoContract {
        return VisaDetailRepo(visaDetailDao, dispatcher)
    }

    @Singleton
    @Provides
    fun provideCountryVisaTypeRepo(
        countryVisaTypesDao: CountryVisaTypesDao,
        dispatcher: CoroutineDispatcher
    ): CountryVisaTypesRepoContract {
        return CountryVisaTypesRepo(countryVisaTypesDao, dispatcher)
    }
}