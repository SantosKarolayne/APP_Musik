package com.example.aplicativomusik

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class MensagemAdapter(context: Context, private val mensagemList: List<Mensagem>) :
    ArrayAdapter<Mensagem>(context, 0, mensagemList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        val holder: ViewHolder

        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.list_item_mensagem, parent, false)
            holder = ViewHolder(itemView)
            itemView.tag = holder
        } else {
            holder = itemView.tag as ViewHolder
        }

        val mensagem = getItem(position)
        mensagem?.let {
            holder.textRemetente.text = it.remetente
            holder.textConteudo.text = it.conteudo
        }

        return itemView!!
    }

    private class ViewHolder(view: View) {
        val textRemetente: TextView = view.findViewById(R.id.textRemetente)
        val textConteudo: TextView = view.findViewById(R.id.textConteudo)
    }
}
