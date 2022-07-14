package com.example.valico.data

//import android.arch.persistence.room.*
import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface FreestyleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFreestyle(freestyle: Freestyle)

    @Delete
    suspend fun deleteFreestyle(freestyle: Freestyle)

    @Query("SELECT * FROM freestyle WHERE id = :id")
    suspend fun getFreestyleById(id: Int) :Freestyle?

    @Query("SELECT * FROM freestyle")
    fun getFreestyles() : List<Freestyle>
}