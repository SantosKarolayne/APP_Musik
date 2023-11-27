package com.example.aplicativomusik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fazerCadastro: AppCompatButton = findViewById(R.id.botacadastro)

        fazerCadastro.setOnClickListener{
            val intent = Intent(this,Cadastrar::class.java)
            startActivity(intent)
        }

        val entrar: AppCompatButton = findViewById(R.id.botaoentrarlogin)

        entrar.setOnClickListener{
            val intent = Intent(this,Feed::class.java)
            startActivity(intent)
        }

    }
}