package com.example.classictube.ui.adapters


import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerAdapter<T>(val items:List<T>,val listener: HomeActionListener):RecyclerView.Adapter<BaseRecyclerAdapter.BaseMovieViewHolder>() {

    override fun getItemCount()= items.size

    abstract class BaseMovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}
