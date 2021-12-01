package com.example.carrera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class seecars5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_seecars5)

        val cars5homebutton = findViewById<Button>(R.id.carshomebutton5)

        cars5homebutton.setOnClickListener{

            val  Main = Intent (this, MainActivity::class.java)

            startActivity(Main)
        }
        val cars5nextbutton1 = findViewById<Button>(R.id.carsnextbutton5)

        cars5nextbutton1.setOnClickListener{

            val seecars1 = Intent (this, seecars1::class.java)

            startActivity(seecars1)
        }

    }
}