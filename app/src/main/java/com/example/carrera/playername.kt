package com.example.carrera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
 var nick:String=""
class playername : AppCompatActivity() {
    lateinit var nick_user:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playername)
        nick_user = findViewById(R.id.Nickname)
        val namebutton = findViewById<Button>(R.id.namebutton)
        namebutton.setOnClickListener{
        nick = nick_user.text.toString()
            val choosecar = Intent (this, choosecar::class.java)
            startActivity(choosecar)
        }


    }
}