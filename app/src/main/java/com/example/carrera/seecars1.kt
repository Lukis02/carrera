package com.example.carrera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class seecars1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_seecars1)

        val cars1homebutton = findViewById<Button>(R.id.carshomebutton1)

        cars1homebutton.setOnClickListener{

            val Main = Intent (this, MainActivity::class.java)

            startActivity(Main)
        }
        val cars1nextbutton2 = findViewById<Button>(R.id.carsnextbutton1)

        cars1nextbutton2.setOnClickListener{

            val seecars2 = Intent (this, seecars2::class.java)

            startActivity(seecars2)
        }
    }
}