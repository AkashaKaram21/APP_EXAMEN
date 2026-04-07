package com.example.examen.RecyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.examen.R

/**
* Adapter que crea ViewHolder (MyViewHolder),
* indica quants elements hi ha i demana que es "pintin" amb bind().
*/
class MyAdapter(
   private val items: List<MyItem>,
   private val onItemClick: (MyItem) -> Unit
) : RecyclerView.Adapter<MyViewHolder>() {


   /**
    * Crea (infla) la vista de la fila i construeix el ViewHolder.
    */
   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder{
       val inflater = LayoutInflater.from(parent.context)
       val view = inflater.inflate(R.layout.item_reserva, parent, false)
       return MyViewHolder(view, onItemClick)
   }


   /**
    * Retorna quants elements hi ha a la llista de dades.
    */
   override fun getItemCount(): Int = items.size


   /**
    * Demana al ViewHolder que mostri les dades de la posició donada.
    */
   override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val item = items[position]
       holder.bind(item)
   }
}
