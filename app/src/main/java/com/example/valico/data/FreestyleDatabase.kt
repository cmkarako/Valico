package com.example.valico.data


//import android.arch.persistence.room.Database
//import android.arch.persistence.room.RoomDatabase
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Freestyle::class, BarrelFreestyle::class],
    version = 1
)

abstract class FreestyleDatabase : RoomDatabase(){

    //abstract fun freestyleDao() : FreestyleDao
    abstract val dao: FreestyleDao
}

abstract class BarrelFreestyleDatabase : RoomDatabase(){

    //abstract fun freestyleDao() : FreestyleDao
    abstract val dao: FreestyleDao
}