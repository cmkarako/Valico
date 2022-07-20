package com.example.valico.data

//import android.arch.persistence.room.Entity
//import android.arch.persistence.room.PrimaryKey
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.widget.AdapterView
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "freestyle")
data class Freestyle(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val imageUrl: Int,
    val isBarrelFreestyle: Boolean,
    val isHorseFreestyle: Boolean,

)
//@Entity(tableName = "barrelFreestyle")
//data class BarrelFreestyle(
//    val title: String,
//    val imageUrl: Int,
//    @PrimaryKey(autoGenerate = true) val id: Int
//)

