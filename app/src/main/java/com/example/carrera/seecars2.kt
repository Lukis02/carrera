package com.example.carrera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class seecars2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_seecars2)

        val cars2homebutton = findViewById<Button>(R.id.carshomebutton2)

        cars2homebutton.setOnClickListener{

            val  Main = Intent (this, MainActivity::class.java)

            startActivity(Main)
        }
        val cars2nextbutton3 = findViewById<Button>(R.id.carsnextbutton2)

        cars2nextbutton3.setOnClickListener{

            val seecars3 = Intent (this, seecars3::class.java)

            startActivity(seecars3)
        }
    }
}