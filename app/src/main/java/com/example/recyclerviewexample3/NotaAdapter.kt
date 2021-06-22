package com.example.recyclerviewexample3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*



class NotaAdapter(val listaNotas: List<NotaItem>) : RecyclerView.Adapter<NotaAdapter.NotaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotaViewHolder {
        val itemViewCriada =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return NotaViewHolder(itemViewCriada)
    }

    override fun onBindViewHolder(holder: NotaViewHolder, position: Int) {
        val notaAtual = listaNotas[position]

        holder.textView1.text = notaAtual.titulo
        holder.textView2.text = notaAtual.descricao
    }

    override fun getItemCount(): Int {
        return listaNotas.size
    }

    class NotaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView1: TextView = itemView.text_view_1
        val textView2: TextView = itemView.text_view_2
    }
}