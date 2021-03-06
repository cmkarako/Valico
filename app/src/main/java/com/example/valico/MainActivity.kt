package com.example.valico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.valico.adapters.ItemAdapter
import com.example.valico.data.Freestyle
import com.example.valico.data.FreestyleDatabase

class MainActivity : AppCompatActivity() {

    var contentHasLoaded = false
    lateinit var freestyleRV: RecyclerView
    lateinit var itemLayout: ImageView
    private lateinit var newFreestyleList : ArrayList<Freestyle>

    override fun onCreate(savedInstanceState: Bundle?) {

//        val animLogo: ImageView = findViewById(R.id.imageView)
//        animLogo.setBackgroundResource(R.drawable.anim_logo)
//
//        val newLogo = animLogo.background
//        if (newLogo is Animatable) {
//            newLogo.start()
//        }

        //setTheme(R.style.Theme_App_Starting)

        super.onCreate(savedInstanceState)
        installSplashScreen()

//        Thread.sleep(2000)
//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
        setContentView(R.layout.activity_main)

        val database = Room.databaseBuilder(
            this, FreestyleDatabase::class.java,  "freestyle_database"
        )
            .allowMainThreadQueries()
            .build()

        database.dao.insertFreestyle(Freestyle(0,"Special K", R.drawable.freestyle1, false, false))
        database.dao.insertFreestyle(Freestyle(0,"Candle", R.drawable.freestyle2, false, false))

        val allFreestyles = database.dao.getFreestyles()
//        val itemLayout: ImageView = findViewById(R.id.image)
//        itemLayout.setOnClickListener() {
//            if(itemLayout.isSelected) { Toast.makeText(this, "selected item", Toast.LENGTH_LONG).show() } }
//        itemLayout.isSelected
        Log.d("test", "allFreestyles size? ${allFreestyles.size}")

        freestyleRV = findViewById(R.id.recylcerViewFreestyles)
        freestyleRV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val freestyleAdapter = ItemAdapter(this, allFreestyles)

        freestyleRV.adapter = freestyleAdapter
        //val itemClicked = database.dao.getFreestyleById(position)
        freestyleAdapter.setOnItemClickListener(object: ItemAdapter.onItemClickListener{
            override fun onItemClick(position: Int, freestyle: Freestyle) {
                val itemClicked = database.dao.getFreestyleById(position+1)
                Toast.makeText(this@MainActivity, "selected item ${
                    database.dao.getFreestyleById(
                        position+1
                    )?.title ?: "Default Freestyle"
                }", Toast.LENGTH_LONG).show()

                database.dao.insertFreestyle(Freestyle(0, database.dao.getFreestyleById(position+1)?.title ?: "Default Freestyle",
                    database.dao.getFreestyleById(position+1)?.imageUrl ?: R.drawable.freestyle1, false, false))

            }
        })

    }
    private fun getItemsList(): ArrayList<String> {
        val list = ArrayList<String>()

        for (i in 1..15){
            list.add("Freestyle $i")
        }
        return list
    }

     fun onFreestyleClick(freestyle: Freestyle){
        intent.putExtra("image", freestyle.imageUrl)
        Toast.makeText(this, "selected item ${freestyle.title}", Toast.LENGTH_LONG).show()
    }
}