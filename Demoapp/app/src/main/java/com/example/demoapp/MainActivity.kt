package com.example.demoapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDark= findViewById<Button>(R.id.btnDark)
        val btnLight= findViewById<Button>(R.id.btnLight)


        btnDark.setOnClickListener {
            intent= Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }

        btnLight.setOnClickListener {
            intent= Intent(applicationContext, MainActivity3::class.java)
            startActivity(intent)
        }

    }
}