package com.example.imageview_noel_rocha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val boton1 = findViewById<Button>(R.id.btnAbrir)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        boton1.setOnClickListener {
            val intentAbrir = Intent(this,MainActivity2::class.java)
            startActivity(intentAbrir)
        }

    }
}