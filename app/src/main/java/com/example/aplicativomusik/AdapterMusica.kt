package com.example.musikp

import Mensagens
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.aplicativomusik.ConteudoRepositorio
import com.example.aplicativomusik.R
import com.example.aplicativomusik.Repositorio

class AdapterMusica(private val context: Context, private val musicaList: List<Musica>) : BaseAdapter() {
    override fun getCount(): Int {
        return musicaList.size
    }

    override fun getItem(position: Int): Any {
        return musicaList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val viewHolder: ViewHolder

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        val musica = getItem(position) as Musica
        viewHolder.imagem.setImageResource(musica.imagem)
        viewHolder.descricao.text = musica.descricao

        view.setOnClickListener {
            val intent = Intent(context, Repositorio::class.java)

            // Aqui você pode adicionar uma lógica para verificar o usuário clicado e abrir o repositório correspondente
            when (musica.descricao) {
                "Karolayne@gmail.com              @Karolayne Vejam essa minha nova composição Amor" -> intent.putExtra("repositorio", "RepositorioKarolayne")
                "Hugo@gmail.com              @Hugo   Da uma olhadinha no meu repositorio , Odio embreve em todas as plataformas digitais" -> intent.putExtra("repositorio", "RepositorioGuilherme")
                "André@gmail.com              @André   Comprei novas demo amor e odio" -> intent.putExtra("repositorio", "RepositorioHugo")
                "Guilherme@gmail.com              @Guilherme   Fiz o remix de odio" -> intent.putExtra("repositorio", "RepositorioFabricio")
                "Fabricio@gmail.com              @Fabricio   Alguém poderia me ensinar a tocar essas melodias" -> intent.putExtra("repositorio", "RepositorioAndre")
                // Adicione mais casos conforme necessário

                else -> {
                    // Lógica padrão ou mensagem de erro
                    intent.putExtra("repositorio", "RepositorioPadrao")
                }
            }

            context.startActivity(intent)
        }

        return view
    }

    private class ViewHolder(view: View) {
        val imagem: ImageView = view.findViewById(R.id.imageRepositorio)
        val descricao: TextView = view.findViewById(R.id.tvDescricao)
    }
}
