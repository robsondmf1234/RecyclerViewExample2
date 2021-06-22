package com.example.recyclerviewexample3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

/*
* 1 Na activity_main, colocar um RecyclerView
* 2 Criar um arquivo de layout com cardview (android:layout_width="match_parent" ,android:layout_height="wrap_content"
* para abrigar as view que serão mostradas
* 3 Criar o model da classe(NotaItem)
* 4 Criar o Adapter(NotaAdapter) ir para NotaAdapter
* 5
* */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaDeNotas = gerarNota(101)

        recycler_view.adapter = NotaAdapter(listaDeNotas)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }



    private fun gerarNota(size: Int): List<NotaItem> {

        val list = ArrayList<NotaItem>()

        for (i in 1 until size) {
            val item = NotaItem("Titulo $i", "Descrição $i")
            list += item
        }
        return list
    }
}