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
            Musica(R.drawable.karol, "Karolayne@gmail.com              @Karolayne Vejam essa minha nova composição Amor"),
            Musica(R.drawable.hugo, "Hugo@gmail.com              @Hugo   Da uma olhadinha no meu repositorio , Odio embreve em todas as plataformas digitais"),
            Musica(R.drawable.andre, "\"André@gmail.com              @André   Comprei novas demo amor e odio"),
            Musica(R.drawable.guilherme, "\"Guilherme@gmail.com              @Guilherme   Fiz o remix de odio "),
            Musica(R.drawable.fabricio, "\"Fabricio@gmail.com              @Fabricio   Alguém poderia me ensinar a tocar essas melodias")

        )

    }
}