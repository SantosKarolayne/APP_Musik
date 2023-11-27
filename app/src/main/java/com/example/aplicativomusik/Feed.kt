package com.example.aplicativomusik


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.widget.AppCompatButton
import com.example.musikp.AdapterMusica
import com.example.musikp.RepositorioRepository

class Feed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        val lvRepositorio: ListView = findViewById(R.id.listViewRepositorio)
        lvRepositorio.adapter = AdapterMusica(this, RepositorioRepository.getRepositorio())

        val post: AppCompatButton = findViewById(R.id.btnPost)

        post.setOnClickListener{
            val intent = Intent(this,Publicar::class.java)
            startActivity(intent)
        }
    }
}