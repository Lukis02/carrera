package com.example.carrera
import com.example.carrera.Car
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
            Car("AMG","Mercedes Benz", "medium","white",30, "medium", 69)
            val Races = Intent (this, Race::class.java)

            startActivity(Races)
        }
        val chooseAudi = findViewById<Button>(R.id.audibutton)

        chooseAudi.setOnClickListener{
            Car("R8","audi", "medium","black",50, "medium", 75)

            val Races = Intent (this, Race::class.java)

            startActivity(Races)

        }
        val chooseJeep = findViewById<Button>(R.id.jeepbutton)

        chooseJeep.setOnClickListener{
            Car("XD","Jeep", "Large","platinum",46, "high", 20)

            val Races = Intent (this, Race::class.java)

            startActivity(Races)
    }
        val chooseFord = findViewById<Button>(R.id.fordbutton)

        chooseFord.setOnClickListener{
            Car("Mustang GT","Ford", "medium","kiwi green",50, "medium", 60)

            val Races = Intent (this, Race::class.java)

            startActivity(Races)

}
        val chooseLandRo = findViewById<Button>(R.id.landroverbutton)

        chooseLandRo.setOnClickListener{
            Car("XE","Land Rover", "Large","Dark grey",42, "high", 80)

            val Races = Intent (this, Race::class.java)

            startActivity(Races)
}}//var carb = Car(brand =  )
}