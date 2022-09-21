package com.example.ocean_android_intro_13_e_15_09_2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    companion object {
        const val NOME_DIGITADO = "NOME_DIGITADO"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        // cria a Intent no escopo da classe para acessar em todos os métodos e poder enviar pelo btEnviar
        val intentNovaTela = Intent(this, ResultadoActivity::class.java)


        // Pegar elemento Button
        val btEnviar = findViewById<Button>(R.id.btEnviar)

        // Pegar elemento TextView
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        // Pegar elemento InputText
        val etNome = findViewById<EditText>(R.id.etNome)

        // Adicionar listener para btEnviar
        btEnviar.setOnClickListener {
            val nome = etNome.text

            // Alterar TextView
            if (nome.isNotBlank()) {
                tvResultado.text = nome
                Toast.makeText(this, "Texto Alterado!", Toast.LENGTH_SHORT).show()
            }

            // inserir, dentro da Intent, o nome que foi digitado
            val nomeDigitado = etNome.text.toString()
            intentNovaTela.putExtra(NOME_DIGITADO, nomeDigitado)
        }

        // Abrir Nova Tela

        // Pegar elemento button "Abrir Nova Tela"
        val btAbrirNovaTela = findViewById<Button>(R.id.btAbrirNovaTela)

        btAbrirNovaTela.setOnClickListener {
            // registra a Intent especificando que é uma Activity
            startActivity(intentNovaTela)
        }
    }
}
