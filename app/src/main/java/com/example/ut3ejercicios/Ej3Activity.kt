package com.example.ut3ejercicios

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ej3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ej3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnPantalla1 = findViewById<Button>(R.id.btnPantalla1)
        btnPantalla1.setOnClickListener {
            val intent = Intent(this, Ej3Pantalla1Activity::class.java)
            startActivity(intent)
        }

        val btnPantalla2 = findViewById<Button>(R.id.btnPantalla2)
        btnPantalla2.setOnClickListener {
            val intent = Intent(this, Ej3Pantalla2Activity::class.java)
            startActivity(intent)
        }

        val btnPantalla3 = findViewById<Button>(R.id.btnPantalla3)
        btnPantalla3.setOnClickListener {
            val intent = Intent(this, Ej3Pantalla3Activity::class.java)
            startActivity(intent)
        }
    }
}