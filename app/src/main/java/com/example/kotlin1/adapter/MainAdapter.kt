package com.example.kotlin1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin1.R

data class MainAdapter(private val names: List<String>) :
    RecyclerView.Adapter<MainAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvText1: TextView = itemView.findViewById(R.id.tv_text_1)
        val tvText2: TextView = itemView.findViewById(R.id.tv_text_2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_recycler_view, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvText1.text = names[position]
        holder.tvText2.text = "Arzymat"
    }

    override fun getItemCount(): Int {
        return names.size
    }

}


