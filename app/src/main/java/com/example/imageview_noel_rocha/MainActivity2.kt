package com.example.imageview_noel_rocha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    val  botonVolver = findViewById<Button>(R.id.btnVolver)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        botonVolver.setOnClickListener {
            val intentVolver = Intent(this,MainActivity::class.java)
            startActivity(intentVolver)
        }
    }
}