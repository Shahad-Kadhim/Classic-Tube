package com.example.classictube.ui.adapter.movieAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.classictube.R
import com.example.classictube.data.movie.Movie
import com.example.classictube.ui.adapter.HomeActionListener


class MovieAdapter(private val items: List<Movie>,private val listener: HomeActionListener) : RecyclerView.Adapter<MovieAdapter.BaseMovieViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MovieViewHolder(LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        )

        override fun onBindViewHolder(holder: BaseMovieViewHolder, position: Int) {
             bindMovie (holder as MovieViewHolder, position)
            }

        private fun bindMovie(holder: MovieViewHolder, position: Int){
            val currentMovie = items[position]
            holder.binding.apply{
                //هنا توصيل البيانات للرسايكيلر الاولى
            }
        }


        override fun getItemCount() = items.size

        abstract class BaseMovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
        class MovieViewHolder(itemView: View) : BaseMovieViewHolder(itemView){
            val binding = ItemMovieBinding.bind(itemView)

        }




}