package com.example.valico.adapters

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.valico.R
import com.example.valico.data.Freestyle

class ItemAdapter(val context: Context, val freestyles: List<Freestyle>) :
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    private val allFreestyles = ArrayList<Freestyle>()

    private lateinit var mListener : onItemClickListener


    class ViewHolder(itemView: View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView) {
        val titleTV: TextView = itemView.findViewById(R.id.freestyleDescription)
        val image: ImageView = itemView.findViewById(R.id.image)

        init {
            itemView.setOnClickListener{
                listener.onItemClick(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_freestyle, parent, false)
        return ViewHolder(itemView, mListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val freestyle = freestyles.get(position)
        holder.titleTV.text = freestyle.title
        holder.image.setImageDrawable(ContextCompat.getDrawable(context, freestyle.imageUrl))
        //holder.titleTV.text = allFreestyles[position].title

    }

    override fun getItemCount(): Int {
        return freestyles.size
    }

    interface onItemClickListener {
        fun onItemClick(position : Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }
}


