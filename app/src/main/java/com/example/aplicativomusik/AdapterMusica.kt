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

class AdapterMusica (private val context: Context, private val musicaList:List<Musica>): BaseAdapter(){
    override fun getCount():Int{
        return musicaList.size
    }
    override fun getItem(position:Int):Any{
        return musicaList[position]
    }
    override fun getItemId(position: Int):Long{
        return position.toLong()
    }
    override fun getView(position:Int,convertView:View?, parent : ViewGroup?):View{

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
            intent.putExtra("descricao", musica.descricao)
            context.startActivity(intent)
        }

        return view

        if(convertView == null ){
            view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
            viewHolder = ViewHolder (view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        //val musica estava aqui
        viewHolder.imagem.setImageResource(musica.imagem)
        viewHolder.descricao.text = musica.descricao

        return view
    }
    private class ViewHolder(view:View){
        val  imagem: ImageView = view.findViewById(R.id.imageRepositorio)
        val descricao : TextView = view.findViewById(R.id.tvDescricao)
    }


}

