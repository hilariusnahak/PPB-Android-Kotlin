package com.hilariusnahak.belajarrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val list: ArrayList<Users>) : RecyclerView.Adapter<Adapter.ListViewHolder>() {
	
	
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
		return ListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false))
	}
	
	override fun getItemCount(): Int = list.size
	
	override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
	
	}
	class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
		val lbList: TextView
		
		init {
			lbList = itemView.findViewById(R.id.lb_list)
		}
	}
}