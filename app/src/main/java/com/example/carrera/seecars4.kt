package com.example.carrera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class seecars4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_seecars4)

        val cars4homebutton = findViewById<Button>(R.id.carshomebutton4)

        cars4homebutton.setOnClickListener{

            val  Main = Intent (this, MainActivity::class.java)

            startActivity(Main)
        }
        val cars4nextbutton5 = findViewById<Button>(R.id.carsnextbutton4)

        cars4nextbutton5.setOnClickListener{

            val seecars5 = Intent (this, seecars5::class.java)

            startActivity(seecars5)
        }
    }
}