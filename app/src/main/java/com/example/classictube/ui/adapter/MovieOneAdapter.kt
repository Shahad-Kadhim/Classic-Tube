package com.example.classictube.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.classictube.R
import com.example.classictube.data.movie.MovieOne

class MovieOneAdapter (private val items: List<MovieOne>, private val listener: HomeActionListener) : RecyclerView.Adapter<MovieOneAdapter.BaseMovieOneViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MovieOneViewHolder(
            LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_movie_one, parent, false)
        )

        override fun onBindViewHolder(holder: BaseMovieOneViewHolder, position: Int) {
            bindMovieOne(holder as MovieOneViewHolder, position)
        }

        private fun bindMovieOne(holder:MovieOneViewHolder, position: Int){
            val currentMovieOne = items[position]
            holder.binding.apply{
                //هنا توصيل البيانات للرسايكيلر الثانيه
            }
        }


        override fun getItemCount() = items.size

        abstract class BaseMovieOneViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
        class MovieOneViewHolder(itemView: View) : BaseMovieOneViewHolder(itemView){
            val binding = ItemMovieOneBinding.bind(itemView)

        }


    }