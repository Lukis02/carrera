package com.example.carrera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import java.util.*
import kotlin.random.Random

class Race : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_race)
        val nickrace = findViewById<TextView>(R.id.nickrace)

        nickrace.setText(nick)
        val brandcar = findViewById<TextView>(R.id.carbrand)
        //brandcar.setText(carb)
        val runbutton = findViewById<Button>(R.id.runbutton)
        val changeImage = findViewById<ImageView>(R.id.imagefun)
        val racetext = findViewById<TextView>(R.id.textrace)
        fun park (){changeImage.setImageResource(R.drawable.parking)
                    racetext.setText(getString(R.string.park))
                    runbutton.setText("next") }
        fun brake (){changeImage.setImageResource(R.drawable.frena)
            racetext.setText("has frenado debido a que ha pasado una abuela")
            runbutton.setText("next")}
        fun speedup(){changeImage.setImageResource(R.drawable.accelerate)
            racetext.setText("has pisado el acelerador a tope")
            runbutton.setText("next")}
        fun stop(){changeImage.setImageResource(R.drawable.para)

            racetext.setText("Se te ha acabado la batería y has perdido tiempo recargándola")
            runbutton.setText("next")}
        fun explode(){changeImage.setImageResource(R.drawable.explode)
            racetext.setText("debido a un fallo técnico tu coche ha explotado")
            runbutton.setText("next")
            brandcar.setText("Has quedado eliminado")}
        fun end(){changeImage.setImageResource(R.drawable.finish)
            racetext.setText("has quedado")
            var result = Random.nextInt(1, 5)

            when (result){
                1 ->brandcar.setText("primero")
                2 ->brandcar.setText("segundo")
                3 ->brandcar.setText("tercero")
                4 ->brandcar.setText("cuarto")
                5 ->brandcar.setText("quinto")

            }
            runbutton.setText("next")}

        runbutton.setOnClickListener{
            var random = Random.nextInt(0, 7)


                when (random) {

                    1 -> park()
                    2 -> brake()
                    3 -> speedup()
                    4 -> stop()
                    5 -> explode()
                    6 -> end()
                    }
                }
           }
    }



