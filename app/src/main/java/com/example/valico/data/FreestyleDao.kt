package com.example.valico.data

//import android.arch.persistence.room.*
import androidx.room.*

@Dao
interface FreestyleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFreestyle(freestyle: Freestyle)

    @Delete
    fun deleteFreestyle(freestyle: Freestyle)

    @Query("SELECT * FROM freestyle WHERE id = :id")
    fun getFreestyleById(id: Int) :Freestyle?

    @Query("SELECT * FROM freestyle")
    fun getFreestyles() : List<Freestyle>
}

//@Dao
//interface BarrelFreestyleDao {
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    fun insertBarrelFreestyle(barrelFreestyle: Freestyle?)
//
//    @Delete
//    fun deleteBarrelFreestyle(barrelFreestyle: BarrelFreestyle)
//
//    @Query("SELECT * FROM barrelFreestyle WHERE id = :id")
//    fun getBarrelFreestyleById(id: Int) :BarrelFreestyle?
//
//    @Query("SELECT * FROM barrelFreestyle")
//    fun getBarrelFreestyles() : List<BarrelFreestyle>
//}