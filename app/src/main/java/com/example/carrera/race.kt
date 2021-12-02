package com.example.carrera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.carrera.playername
class Race : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_race)

        val nickrace = findViewById<TextView>(R.id.nickrace)
        println(nick)
        nickrace.setText(nick)
    }
    fun start(){}
    fun park(){}
    fun brake(){}
    fun speedUp(){}
    fun stop(){}
    fun explode(){}
    fun end(){}

    }
