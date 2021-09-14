package com.example.classictube.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.classictube.R
import com.example.classictube.data.domain.HomeItem
import com.example.classictube.data.movie.Movie
import com.example.classictube.data.movie.MovieOne
import com.example.classictube.data.movie.MovieTwo
import com.example.classictube.data.domain.enum.HomeItemType
import java.lang.Exception

class  HomeAdapter (private val items: List<HomeItem<Any>>, private val listener: HomeActionListener) : RecyclerView.Adapter<HomeAdapter.BaseHomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHomeViewHolder {
        return when(viewType){
            VIEW_TYPE_MOVIE -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movies_list, parent, false)
                MovieViewHolder(view)
            }
            VIEW_TYPE_MOVIES_ONE -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movies_one_list, parent, false)
                MoviesOneViewHolder(view)
            }
            VIEW_TYPE_MOVIES_TWO -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movies_two_list, parent, false)
                MoviesTwoViewHolder(view)
            }
            else -> throw Exception("UNKNOWN VIEW TYPE")
        }
    }

    override fun onBindViewHolder(holder: BaseHomeViewHolder, position: Int) {
        when(holder){
            is MovieViewHolder -> bindMovie(holder, position)
            is MoviesOneViewHolder -> bindMovieOne(holder, position)
            is MoviesTwoViewHolder -> bindMovieTwo(holder, position)
        }
    }

    private fun bindMovie(holder: MovieViewHolder, position: Int){
        val currentMovie = items[position].item as List<Movie>
        val adapter = MovieAdapter(currentMovie, listener)
        holder.binding.apply {
            recyclermovies.adapter = adapter
        }
    }

    private fun bindMovieOne(holder: MoviesOneViewHolder, position: Int){
        val currentMovieOne = items[position].item as List<MovieOne>
        val adapter = MovieOneAdapter(currentMovieOne, listener)
        holder.binding.apply {
            recyclermoviesone.adapter = adapter
        }
    }

    private fun bindMovieTwo(holder: MoviesTwoViewHolder, position: Int){
        val currentMovieTwo = items[position].item as List<MovieTwo>
        val adapter = MovieTwoAdapter(currentMovieTwo, listener)
        holder.binding.apply {
            recyclermoviestwo.adapter = adapter
        }
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int {
        return when(items[position].type){
            HomeItemType.TYPE_MOVIE -> VIEW_TYPE_MOVIE
            HomeItemType.TYPE_MOVIES_ONE -> VIEW_TYPE_MOVIES_ONE
            HomeItemType.TYPE_MOVIES_TWO -> VIEW_TYPE_MOVIES_TWO
        }
    }


    abstract class BaseHomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    class MoviesTwoViewHolder(itemView: View) : BaseHomeViewHolder(itemView){
        val binding = ItemMoviesTwoListBinding.bind(itemView)
    }
    class MoviesOneViewHolder(itemView: View) : BaseHomeViewHolder(itemView){
        val binding = ItemMoviesOneListBinding.bind(itemView)
    }
    class MovieViewHolder(itemView: View) : BaseHomeViewHolder(itemView){
        val binding = ItemMoviesListBinding.bind(itemView)
    }

    companion object{
        private const val VIEW_TYPE_MOVIE = 1
        private const val VIEW_TYPE_MOVIES_ONE = 2
        private const val VIEW_TYPE_MOVIES_TWO = 3
    }

}