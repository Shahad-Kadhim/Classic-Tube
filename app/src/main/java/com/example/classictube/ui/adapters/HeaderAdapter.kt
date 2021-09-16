package com.example.classictube.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.classictube.R
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.databinding.ItemMovieHeaderBinding


class HeaderAdapter(items: List<MoviesItem>, listener: HomeActionListener) :
    BaseRecyclerAdapter<MoviesItem>(items,listener) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ) =
        MovieViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_movie_header, parent, false)
        )

    override fun onBindViewHolder(holder: BaseMovieViewHolder, position: Int) {
        if (holder is MovieViewHolder)
            bindMovie(holder,items[position])
    }

    private fun bindMovie(holder:MovieViewHolder, movie:MoviesItem){
        holder.binding.apply {
            this.movieName.text=movie.title
            Glide.with(this.imageMovieHeader).load(movie.art).into(this.imageMovieHeader)
            this.descriptionMovieText.text=movie.description
            this.movieTime.text=movie.duration.toString()
            this.year.text=movie.year.toString()
            root.setOnClickListener { listener.onClickMovie(movie) }
        }
    }


    class MovieViewHolder(itemView: View) : BaseMovieViewHolder(itemView){
        val binding =ItemMovieHeaderBinding.bind(itemView)
    }

}