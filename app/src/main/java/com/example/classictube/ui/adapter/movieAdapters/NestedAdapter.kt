package com.example.classictube.ui.adapter.movieAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.classictube.R
import com.example.classictube.data.domain.CategoryItem
import com.example.classictube.data.domain.HomeItem
import com.example.classictube.data.enum.HomeItemType
import com.example.classictube.databinding.ItemMoviesListBinding
import com.example.classictube.databinding.ItemMoviesOneListBinding
import com.example.classictube.ui.adapter.HomeActionListener
import java.lang.Exception

class  NestedAdapter (items: List<HomeItem>, listener: HomeActionListener):BaseRecyclerAdapter<HomeItem>(items, listener) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseMovieViewHolder {
        return when(viewType){
            VIEW_TYPE_HEADER -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movies_list, parent, false)
                MovieViewHolder(view)
            }
            VIEW_TYPE_MOVIES -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movies_one_list, parent, false)
                MoviesOneViewHolder(view)
            }
            else -> throw Exception("UNKNOWN VIEW TYPE")
        }
    }

    override fun onBindViewHolder(holder: BaseMovieViewHolder, position: Int) {
        val currentItem=items[position].item.map { CategoryItem(it.title,it.moviesItems)}
        when (holder) {
            is MovieViewHolder -> {
                holder.binding.recyclerMovies.apply {
                    adapter=HeaderAdapter(currentItem,listener)
                }
            }
            is MoviesOneViewHolder -> {
                holder.binding.recyclerMoviesOne.apply {
                    adapter=ItemesAdapter(currentItem,listener)
                }
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(position){
            0 -> VIEW_TYPE_HEADER
            else -> VIEW_TYPE_MOVIES
        }
    }

    class MoviesOneViewHolder(itemView: View) : BaseMovieViewHolder(itemView){
        val binding = ItemMoviesOneListBinding.bind(itemView)
    }
    class MovieViewHolder(itemView: View) : BaseMovieViewHolder(itemView){
        val binding = ItemMoviesListBinding.bind(itemView)
    }

    companion object{
        private const val VIEW_TYPE_HEADER = 1
        private const val VIEW_TYPE_MOVIES = 2
    }

}