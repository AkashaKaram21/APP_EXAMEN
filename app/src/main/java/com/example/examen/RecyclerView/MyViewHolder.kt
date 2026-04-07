package com.example.examen.RecyclerView

import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.examen.R

/**
* ViewHolder responsable d'una fila del RecyclerView.
* Encapsula la vista de la fila i sap com "pintar-hi" un MyItem.
*/
class MyViewHolder(
    itemView: View,
    private val onItemClick: (MyItem) -> Unit
) : RecyclerView.ViewHolder(itemView) {


    private val ivMaterial: ImageView = itemView.findViewById(R.id.ivMaterial)
    private val tvDescripcio: TextView = itemView.findViewById(R.id.tvDescripcio)
    private val tvDates: TextView = itemView.findViewById(R.id.tvDates)
    private val btnDelete: ImageButton = itemView.findViewById(R.id.btnDelete)


   /**
    * Actualitza les vistes de la fila amb les dades de MyItem
    * i configura els listeners d'esdeveniments.
    */
   fun bind(item: MyItem) {
       ivMaterial.text = item.idmaterial
       tvDescripcio.text = item.descripcio
       tvDates.text = item.datareserva



       // Exemple de gestió de clic sobre tota la fila
       itemView.setOnClickListener {
           onItemClick(item)
       }
   }
}
