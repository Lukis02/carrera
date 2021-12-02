package com.example.carrera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class choosecar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val Arraycars = mutableListOf<Car>()
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_choosecar)

        val chooseMercedes = findViewById<Button>(R.id.mercedesbutton)

        chooseMercedes.setOnClickListener{

            val Races = Intent (this, Race::class.java)

            startActivity(Races)
        }
        val chooseAudi = findViewById<Button>(R.id.audibutton)

        chooseAudi.setOnClickListener{

            val Races = Intent (this, Race::class.java)

            startActivity(Races)

        }
        val chooseJeep = findViewById<Button>(R.id.jeepbutton)

        chooseJeep.setOnClickListener{

            val Races = Intent (this, Race::class.java)

            startActivity(Races)
    }
        val chooseFord = findViewById<Button>(R.id.fordbutton)

        chooseFord.setOnClickListener{

            val Races = Intent (this, Race::class.java)

            startActivity(Races)

}
        val chooseLandRo = findViewById<Button>(R.id.landroverbutton)

        chooseLandRo.setOnClickListener{

            val Races = Intent (this, Race::class.java)

            startActivity(Races)
}}}