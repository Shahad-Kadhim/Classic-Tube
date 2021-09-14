package com.example.classictube.ui.adapter.movieAdapters


import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.classictube.ui.adapter.HomeActionListener

abstract class BaseRecyclerAdapter<T>(val items:List<T>,val listener: HomeActionListener):RecyclerView.Adapter<BaseRecyclerAdapter.BaseMovieViewHolder>() {

    override fun getItemCount()= items.size

    abstract class BaseMovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}
