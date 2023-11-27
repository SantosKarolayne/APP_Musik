package com.example.aplicativomusik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class Cadastrar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar)

        val Cadastrar: AppCompatButton = findViewById(R.id.btnCadastrar)

        Cadastrar.setOnClickListener{
            val intent = Intent(this,Feed::class.java)
            startActivity(intent)
        }
    }
}