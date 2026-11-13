package com.example.ut3ejercicios

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnEj1 = findViewById<Button>(R.id.btnEj1)
        btnEj1.setOnClickListener {
            val intent = Intent(this, Ej1Activity::class.java)
            startActivity(intent)
        }

        val btnEj2 = findViewById<Button>(R.id.btnEj2)
        btnEj2.setOnClickListener {
            val intent = Intent(this, Ej2Activity::class.java)
            startActivity(intent)
        }

        val btnEj3 = findViewById<Button>(R.id.btnEj3)
        btnEj3.setOnClickListener {
            val intent = Intent(this, Ej3Activity::class.java)
            startActivity(intent)
        }

        val btnEj4 = findViewById<Button>(R.id.btnEj4)
        btnEj4.setOnClickListener {
            val intent = Intent(this, Ej4Activity::class.java)
            startActivity(intent)
        }

        val btnEj5 = findViewById<Button>(R.id.btnEj5)
        btnEj5.setOnClickListener {
            val intent = Intent(this, Ej5Activity::class.java)
            startActivity(intent)
        }

        val btnEj6 = findViewById<Button>(R.id.btnEj6)
        btnEj6.setOnClickListener {
            val intent = Intent(this, Ej6Activity::class.java)
            startActivity(intent)
        }
    }
}