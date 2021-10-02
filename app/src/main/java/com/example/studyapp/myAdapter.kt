package com.example.studyapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class myAdapter(private val subject:ArrayList<ArrayList<String>>, private val activity:Activity): RecyclerView.Adapter<myAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView : View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val title=subject[position][0]
        val detail=subject[position][1]
        val info=subject[position][2]
        holder.itemView.apply {
           tvtitle.text=title
            tvdetails.text=detail
            card.setOnClickListener { alertdialog(activity,title,info) }

        }
    }

    override fun getItemCount()=subject.size
}