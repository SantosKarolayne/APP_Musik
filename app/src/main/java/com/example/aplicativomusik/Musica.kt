package com.example.musikp

import android.content.Context
import com.example.aplicativomusik.R

data class Musica (
    val imagem:Int,
    val descricao:String
)

object RepositorioRepository{
    fun getRepositorio():List<Musica>{
        return listOf(
            Musica(R.drawable.karol, "Karolayne@gmail.com              @Karolayne   Hoje tirei uma foto"),
            Musica(R.drawable.hugo, "Hugo@gmail.com              @Hugo   Hoje tirei uma foto"),
            Musica(R.drawable.andre, "\"André@gmail.com              @André   Hoje tirei uma foto"),
            Musica(R.drawable.guilherme, "\"Guilherme@gmail.com              @Guilherme   Hoje tirei uma foto"),
            Musica(R.drawable.fabricio, "\"Fabricio@gmail.com              @Fabricio   Hoje tirei uma foto")

        )

    }
}