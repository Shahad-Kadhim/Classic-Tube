package com.example.classictube.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.classictube.R
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.databinding.ItemPlayListMovieBinding

class PlayListAdapter(items : List<MoviesItem>, listener : HomeActionListener) : BaseRecyclerAdapter<MoviesItem>(items,listener) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): BaseMovieViewHolder = FavoritesViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_play_list_movie,parent,false)
    )
    override fun onBindViewHolder(holder: BaseMovieViewHolder, position: Int) {
        when(holder){
            is FavoritesViewHolder ->{
                holder.binding.apply {
                    TODO()
                }
            }
        }
    }
    class FavoritesViewHolder(itemView : View):BaseRecyclerAdapter.BaseMovieViewHolder(itemView){
        val binding = ItemPlayListMovieBinding.bind(itemView)
    }
}
