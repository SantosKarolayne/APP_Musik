package com.example.aplicativomusik

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class EnviarMensagens : AppCompatActivity() {

    private lateinit var edtMensagem: EditText
    private lateinit var btnEnviar: Button
    private lateinit var listaMensagens: ListView
    private lateinit var adapter: MensagemAdapter

    private val mensagemList = mutableListOf<Mensagem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enviar_mensagens)

        edtMensagem = findViewById(R.id.edtMensagem)
        btnEnviar = findViewById(R.id.btnEnviar)
        listaMensagens = findViewById(R.id.listaMensagens)

        adapter = MensagemAdapter(this, mensagemList)
        listaMensagens.adapter = adapter

        btnEnviar.setOnClickListener {
            val mensagem = edtMensagem.text.toString()
            if (mensagem.isNotEmpty()) {
                adicionarMensagem("Remetente", mensagem)
                edtMensagem.text.clear()
            }
        }
    }

    private fun adicionarMensagem(remetente: String, conteudo: String) {
        val mensagem = Mensagem(remetente, conteudo)
        mensagemList.add(mensagem)
        adapter.notifyDataSetChanged()

        // Rolar para a última mensagem
        listaMensagens.smoothScrollToPosition(adapter.count - 1)
    }
}
