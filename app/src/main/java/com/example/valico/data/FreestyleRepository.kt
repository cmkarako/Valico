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
