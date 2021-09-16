package com.example.classictube.ui.adapter.movieAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.classictube.R
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.databinding.ItemFavoriteMovieBinding
import com.example.classictube.databinding.ItemWatchMovieBinding
import com.example.classictube.ui.adapter.HomeActionListener

class WatchMovieAdapter(items:List<MoviesItem>,listener:HomeActionListener) : BaseRecyclerAdapter<MoviesItem>(items,listener) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): BaseMovieViewHolder = WatchMoviesViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_watch_movie,parent,false)
    )
    override fun onBindViewHolder(holder: BaseMovieViewHolder, position: Int) {
        when(holder){
            is WatchMoviesViewHolder->{
                holder.binding.apply {

                }
            }
        }
    }
    class WatchMoviesViewHolder(itemView: View):BaseRecyclerAdapter.BaseMovieViewHolder(itemView){
        val binding = ItemWatchMovieBinding.bind(itemView)
    }
}
