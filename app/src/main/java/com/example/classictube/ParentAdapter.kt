package com.example.classictube

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.classictube.databinding.ItemMovieBinding
import com.example.classictube.databinding.RecyclerMoviesBinding
import java.lang.Exception

class ParentAdapter (private val items: List<HomeItem<Any>>, private val listener: ParentActionsListener) : RecyclerView.Adapter<ParentAdapter.BaseHomeViewHolder>()  {



        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHomeViewHolder {
            return when(viewType){
                VIEW_TYPE_MOVIE -> {
                    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
                    movieViewHolder(view)
                }

                VIEW_TYPE_MOVIES -> {
                    val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_movies, parent, false)
                    moviesViewHolder(view)
                }
                else -> throw Exception("UNKNOWN VIEW TYPE")
            }
        }

        override fun onBindViewHolder(holder: BaseHomeViewHolder, position: Int) {
            when(holder){
                is movieViewHolder -> bindMovie(holder, position)
                is moviesViewHolder -> bindMovies(holder, position)
            }
        }

        private fun bindMovie(holder: movieViewHolder, position: Int){
            val movie = items[position].item as List<child>
            val adapter= ChildAdapter(movie, listener)
            holder.binding.apply {
                recyclerMovies.adapter = adapter
            }
        }



        private fun bindMovies(holder: moviesViewHolder, position: Int){
            val currentMovies = items[position].item as childTwo
            holder.binding.apply {
                movieName.text = currentMovies.movieName
                textMovieDescription.text = currentMovies.movieDescription
                Glide.with(this.root.context).load(currentMovies.movieVideo).into(imageButtonMovie)
                imageButtonMovie.setOnClickListener { }
            }
        }

        override fun getItemCount() = items.size

        override fun getItemViewType(position: Int): Int {
            return when(items[position].type){
                HomeItemType.TYPE_MOVIE -> VIEW_TYPE_MOVIE
                HomeItemType.TYPE_MOVIES -> VIEW_TYPE_MOVIES
            }
        }


        abstract class BaseHomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
        class moviesViewHolder(itemView: View) : BaseHomeViewHolder(itemView){
            val binding = RecyclerMoviesBinding.bind(itemView)
        }

        class movieViewHolder(itemView: View) : BaseHomeViewHolder(itemView){
            val binding = ItemMovieBinding.bind(itemView)
        }

        companion object{
            private const val VIEW_TYPE_MOVIE = 1
            private const val VIEW_TYPE_MOVIES = 2

        }

    }
