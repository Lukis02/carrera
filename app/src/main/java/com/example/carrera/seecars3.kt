package com.example.carrera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class seecars3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_seecars3)

        val cars3homebutton = findViewById<Button>(R.id.carshomebutton3)

        cars3homebutton.setOnClickListener{

            val Main = Intent (this, MainActivity::class.java)

            startActivity(Main)
        }
        val cars3nextbutton4 = findViewById<Button>(R.id.carsnextbutton3)

        cars3nextbutton4.setOnClickListener{

            val seecars4 = Intent (this, seecars4::class.java)

            startActivity(seecars4)
        }
    }
}