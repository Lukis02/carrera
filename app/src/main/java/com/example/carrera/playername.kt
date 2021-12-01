package com.example.carrera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class playername : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_playername)

        val namebutton = findViewById<Button>(R.id.namebutton)
        namebutton.setOnClickListener{
            val choosecar = Intent (this, choosecar::class.java)
            startActivity(choosecar)
        }


    }
}