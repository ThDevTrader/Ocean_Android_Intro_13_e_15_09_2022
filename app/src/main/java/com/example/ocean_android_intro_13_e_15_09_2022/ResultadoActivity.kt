package com.example.ocean_android_intro_13_e_15_09_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        supportActionBar?.hide()

        // pega nome digitado
        val nomeDigitado = intent.getStringExtra(MainActivity.NOME_DIGITADO)

        // pega tvResultado
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        tvResultado.text = nomeDigitado

        // pega btVoltar
        val btVoltar = findViewById<Button>(R.id.btVoltar)

        // add listener
        btVoltar.setOnClickListener {
            finish()
        }
    }
}