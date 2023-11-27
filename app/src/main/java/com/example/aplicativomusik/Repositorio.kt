package com.example.aplicativomusik


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.widget.AppCompatButton

class Repositorio : AppCompatActivity() {
    private lateinit var lvMinhasComposicoes: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repositorio)

        lvMinhasComposicoes = findViewById(R.id.listaRepositorio)


        val arrayComposicoes = resources.getStringArray(R.array.array_composicoes)

        val adapterComposicoes = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayComposicoes)
        lvMinhasComposicoes.adapter = adapterComposicoes

        lvMinhasComposicoes.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, ConteudoRepositorio::class.java)
            intent.putExtra("nomeRepositorio", arrayComposicoes[position])
            startActivity(intent)
        }



    }
}