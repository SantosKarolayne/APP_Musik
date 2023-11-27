package com.example.aplicativomusik


import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.aplicativomusik.R

class ConteudoRepositorio : AppCompatActivity() {

    private lateinit var imagemComposicao: ImageView
    private lateinit var videoView: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conteudo_repositorio)

        imagemComposicao = findViewById(R.id.imagemComposicao)
        videoView = findViewById(R.id.videoView)

        val parametro = intent.getStringExtra("nomeRepositorio")

        if (parametro != null) {
            if (parametro == "amor") {
                // Exibe a imagem
                imagemComposicao.setImageResource(R.drawable.musicadois)
            } else if (parametro == "odio") {
                // Exibe a imagem
                imagemComposicao.setImageResource(R.drawable.musicaum)
            }
        }

        val mensagembtn: AppCompatButton = findViewById(R.id.btnmensagens)
        mensagembtn.setOnClickListener {
            // Esconde a imagem e exibe o VideoView
            imagemComposicao.visibility = ImageView.GONE
            videoView.visibility = VideoView.VISIBLE


            val videoPath = "android.resource://" + packageName + "/" + R.raw.nome_do_seu_video
            val uri = Uri.parse(videoPath)

            videoView.setVideoURI(uri)
            videoView.start()
        }
    }
}

