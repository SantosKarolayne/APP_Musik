package com.example.aplicativomusik


import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class ConteudoRepositorio : AppCompatActivity() {

    private lateinit var imagemComposicao: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conteudo_repositorio)

        imagemComposicao = findViewById(R.id.imagemComposicao)

        val parametro = intent.getStringExtra("nomeRepositorio")

        if (parametro != null) {
            if (parametro == "amor") {
                imagemComposicao.setImageResource(R.drawable.musicadois)
            } else if (parametro == "odio") {
                imagemComposicao.setImageResource(R.drawable.musicaum)
            }
        }

        val mensagembtn: AppCompatButton = findViewById(R.id.btnmensagens)
        mensagembtn.setOnClickListener {
            val intent = Intent(this, EnviarMensagens::class.java)
            startActivity(intent)
        }
    }
}
