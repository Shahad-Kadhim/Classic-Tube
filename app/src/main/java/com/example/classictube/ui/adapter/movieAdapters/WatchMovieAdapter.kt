package com.example.classictube.ui.adapter.movieAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.classictube.R
import com.example.classictube.ui.adapter.HomeActionListener

class WatchMovieAdapter(items:List<CategoryAdapter>,listener:HomeActionListener) : BaseRecyclerAdapter<CategoryAdapter>(items,listener) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): BaseMovieViewHolder = WatchMoviesViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.activity_home,parent,false)
    )
    override fun onBindViewHolder(holder: BaseMovieViewHolder, position: Int) {
        when(holder){
            is WatchMoviesViewHolder->{
                holder.binding.apply {
                    TODO()
                }
            }
        }
    }
    class WatchMoviesViewHolder(itemsView: View):BaseRecyclerAdapter.BaseMovieViewHolder(itemsView){
        val binding = "MoviesWatch.bind(itemView)"
    }
}
