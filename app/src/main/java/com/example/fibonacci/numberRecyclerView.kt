package com.example.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class RecyclerView(var numList: List<BigInteger>):RecyclerView.Adapter<numberViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): numberViewHolder {
        val itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.num_list_item,parent,false)
        return numberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: numberViewHolder, position: Int) {
        holder.tvnum.text=numList.get(position).toString()
    }
    override fun getItemCount(): Int {
        return numList.size
    }
}
class  numberViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val tvnum=itemView.findViewById<TextView>(R.id.tvnum)
}


