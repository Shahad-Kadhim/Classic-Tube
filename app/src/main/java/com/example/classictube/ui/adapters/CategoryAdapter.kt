package com.example.classictube.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.classictube.R
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.databinding.ItemMovieCategoryBinding

class CategoryAdapter (items: List<MoviesItem>, listener: HomeActionListener) :
    BaseRecyclerAdapter<MoviesItem>(items, listener) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ) =
        MovieCategoryViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_movie_category, parent, false)
        )

    override fun onBindViewHolder(holder: BaseMovieViewHolder, position: Int) {
        if(holder is MovieCategoryViewHolder)
            bindMovie(holder,items[position])

    }

    private fun bindMovie(holder:MovieCategoryViewHolder, movie:MoviesItem){
        holder.binding.apply {
            Glide.with(imageCategory).load(movie.art).into(imageCategory)
            movieName.text=movie.title
            root.setOnClickListener { listener.onClickMovie(movie) }
        }
    }

    class MovieCategoryViewHolder(itemView: View) : BaseMovieViewHolder(itemView){
        val binding = ItemMovieCategoryBinding.bind(itemView)
    }
}



