package com.example.valico.di

import android.app.Application
import androidx.room.Room
//import com.example.valico.data.BarrelFreestyleDatabase
import com.example.valico.data.FreestyleDatabase
import com.example.valico.data.FreestyleRepository
import com.example.valico.data.FreestyleRepositoryImplementation
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideFreestyleDatabase(app: Application): FreestyleDatabase {
        return Room.databaseBuilder(
            app,
            FreestyleDatabase::class.java,
            "freestyle_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideFreestyleRepository(db: FreestyleDatabase) : FreestyleRepository  {
        return FreestyleRepositoryImplementation(db.dao)
    }

}