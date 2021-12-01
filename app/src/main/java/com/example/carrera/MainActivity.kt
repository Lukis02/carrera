package com.example.carrera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val seebutton = findViewById<Button>(R.id.presentcarbutton)

    seebutton.setOnClickListener{
    val seecars1 = Intent (this, seecars1::class.java)
        startActivity(seecars1)
    }
        val racebutton = findViewById<Button>(R.id.racebutton)

        racebutton.setOnClickListener{
            val playername = Intent (this, playername::class.java)
            startActivity(playername)
        }

    }
}


