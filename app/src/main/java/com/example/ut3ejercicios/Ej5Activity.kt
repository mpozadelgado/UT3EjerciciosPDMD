package com.example.ut3ejercicios

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ej5Activity : AppCompatActivity() {

    lateinit var tvPantalla: TextView
    var numero1 = 0.0
    var operacion = ""
    var nuevoNumero = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ej5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tvPantalla = findViewById(R.id.tvPantalla)

        findViewById<Button>(R.id.btn0).setOnClickListener { escribir("0") }
        findViewById<Button>(R.id.btn1).setOnClickListener { escribir("1") }
        findViewById<Button>(R.id.btn2).setOnClickListener { escribir("2") }
        findViewById<Button>(R.id.btn3).setOnClickListener { escribir("3") }
        findViewById<Button>(R.id.btn4).setOnClickListener { escribir("4") }
        findViewById<Button>(R.id.btn5).setOnClickListener { escribir("5") }
        findViewById<Button>(R.id.btn6).setOnClickListener { escribir("6") }
        findViewById<Button>(R.id.btn7).setOnClickListener { escribir("7") }
        findViewById<Button>(R.id.btn8).setOnClickListener { escribir("8") }
        findViewById<Button>(R.id.btn9).setOnClickListener { escribir("9") }
        findViewById<Button>(R.id.btnPunto).setOnClickListener { escribir(".") }

        findViewById<Button>(R.id.btnSuma).setOnClickListener { operar("+") }
        findViewById<Button>(R.id.btnResta).setOnClickListener { operar("-") }
        findViewById<Button>(R.id.btnMulti).setOnClickListener { operar("*") }
        findViewById<Button>(R.id.btnDiv).setOnClickListener { operar("/") }

        findViewById<Button>(R.id.btnIgual).setOnClickListener { calcular() }
        findViewById<Button>(R.id.btnC).setOnClickListener { borrar() }
    }

    fun escribir(tecla: String) {
        if (nuevoNumero) {
            tvPantalla.text = tecla
            nuevoNumero = false
        } else {
            tvPantalla.text = tvPantalla.text.toString() + tecla
        }
    }

    fun operar(op: String) {
        numero1 = tvPantalla.text.toString().toDoubleOrNull() ?: 0.0
        operacion = op
        nuevoNumero = true
    }

    fun calcular() {
        val numero2 = tvPantalla.text.toString().toDoubleOrNull() ?: 0.0
        var resultado = numero2

        if (operacion == "+") {
            resultado = numero1 + numero2
        } else if (operacion == "-") {
            resultado = numero1 - numero2
        } else if (operacion == "*") {
            resultado = numero1 * numero2
        } else if (operacion == "/") {
            resultado = numero1 / numero2
        }

        tvPantalla.text = resultado.toString()
        operacion = ""
        nuevoNumero = true
    }

    fun borrar() {
        tvPantalla.text = "0"
        operacion = ""
        nuevoNumero = true
    }
}