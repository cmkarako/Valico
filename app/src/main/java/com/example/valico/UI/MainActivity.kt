package com.example.valico.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.valico.R

class MainActivity : AppCompatActivity() {

    var contentHasLoaded = false

    override fun onCreate(savedInstanceState: Bundle?) {

//        val animLogo: ImageView = findViewById(R.id.imageView)
//        animLogo.setBackgroundResource(R.drawable.anim_logo)
//
//        val newLogo = animLogo.background
//        if (newLogo is Animatable) {
//            newLogo.start()
//        }

        //setTheme(R.style.Theme_App_Starting)
        installSplashScreen()
        super.onCreate(savedInstanceState)

//        Thread.sleep(2000)
//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
        setContentView(R.layout.activity_main)

    }
    private fun getItemsList(): ArrayList<String> {
        val list = ArrayList<String>()

        for (i in 1..15){
            list.add("Item $i")
        }
        return list
    }
}