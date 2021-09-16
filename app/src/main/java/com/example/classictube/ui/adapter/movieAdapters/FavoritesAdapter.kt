package com.example.classictube.ui.adapter.movieAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.classictube.R
import com.example.classictube.ui.adapter.HomeActionListener

class FavoritesAdapter(items : List<CategoryAdapter>, listener : HomeActionListener) : BaseRecyclerAdapter<CategoryAdapter>(items,listener) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): BaseMovieViewHolder = FavoritesViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.activity_home,parent,false)
    )
    override fun onBindViewHolder(holder: BaseMovieViewHolder, position: Int) {
        when(holder){
            is FavoritesViewHolder->{
                holder.binding.apply {
                    TODO()
                }
            }
        }
    }
    class FavoritesViewHolder(itemView : View):BaseRecyclerAdapter.BaseMovieViewHolder(itemView){
        val binding = "MoviesFavorites.bind(ItemView)"
    }
}
