package com.example.aplicativomusik

import Mensagens
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton

class ConteudoRepositorio : AppCompatActivity() {

    lateinit var imagemComposicao: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conteudo_repositorio)



        var parametro = intent.getStringExtra("nomeRepositorio")

        if(parametro=="amor"){
            imagemComposicao.setImageResource(R.drawable.musicadois)
        }else if(parametro=="odio"){
            imagemComposicao.setImageResource(R.drawable.musicaum)
        }

        val mensagembtn: AppCompatButton = findViewById(R.id.btnmensagens)
        mensagembtn.setOnClickListener{
            val intent = Intent(this,Mensagens::class.java)
            startActivity(intent)
        }

    }
}