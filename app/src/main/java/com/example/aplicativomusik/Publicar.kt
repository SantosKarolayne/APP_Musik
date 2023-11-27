package com.example.aplicativomusik

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.VideoView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.widget.AppCompatButton

class Publicar : AppCompatActivity() {
    private val pickVideo = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data: Intent? = result.data
            data?.data?.let { uri ->
                reproduzirVideo(uri)
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_publicar)

        val publicar: AppCompatButton = findViewById(R.id.buttonPostar)


        publicar.setOnClickListener{
            val intent = Intent(this,Feed::class.java)
            startActivity(intent)
        }








        val buttonSelecionarVideo: Button = findViewById(R.id.buttonSelecionarVideo)

        buttonSelecionarVideo.setOnClickListener {
            selecionarVideo()
        }
    }

    private fun selecionarVideo() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Video.Media.EXTERNAL_CONTENT_URI)
        pickVideo.launch(intent)
    }

    private fun reproduzirVideo(videoUri: Uri) {
        val videoView: VideoView = findViewById(R.id.videoView)
        videoView.setVideoURI(videoUri)
        videoView.start()



    }





}