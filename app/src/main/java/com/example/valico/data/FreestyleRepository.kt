package com.example.valico.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface FreestyleRepository {

    suspend fun insertFreestyle(freestyle: Freestyle)


    suspend fun deleteFreestyle(freestyle: Freestyle)


    suspend fun getFreestyleById(id: Int) :Freestyle?


    fun getFreestyles() : List<Freestyle>
}

interface BarrelFreestyleRepository {
    suspend fun insertBarrelFreestyle(freestyle: Freestyle)


    suspend fun deleteBarrelFreestyle(barrelFreestyle: BarrelFreestyle)


    suspend fun getBarrelFreestyleById(id: Int) :BarrelFreestyle?


    fun getBarrelFreestyles() : List<BarrelFreestyle>
}
