package com.example.classictube.ui.adapter.movieAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.classictube.R
import com.example.classictube.data.movie.MovieTwo
import com.example.classictube.ui.adapter.HomeActionListener

class MovieTwoAdapter(private val items: List<MovieTwo>, private val listener: HomeActionListener) : RecyclerView.Adapter<MovieTwoAdapter.BaseMovieTwoViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MovieTwoViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_movie_two, parent, false)
        )

        override fun onBindViewHolder(holder: BaseMovieTwoViewHolder, position: Int) {
            bindMovieTwo(holder as MovieTwoViewHolder, position)
        }

        private fun bindMovieTwo(holder: MovieTwoViewHolder, position: Int){
            val currentMovieTwo = items[position]
            holder.binding.apply{
                //هنا توصيل البيانات للرسايكيلر الثالثه
            }
        }


        override fun getItemCount() = items.size

        abstract class BaseMovieTwoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
        class MovieTwoViewHolder(itemView: View) : BaseMovieTwoViewHolder(itemView){
            val binding = ItemMovieTwoBinding.bind(itemView)

        }

}