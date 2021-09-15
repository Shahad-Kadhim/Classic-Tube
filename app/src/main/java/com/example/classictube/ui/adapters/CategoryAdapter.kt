package com.example.classictube.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.classictube.R
import com.example.classictube.data.domain.CategoryItem
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.databinding.ItemMovieCategoryBinding

class CategoryAdapter (items: List<MoviesItem>, listener: HomeActionListener) :
    BaseRecyclerAdapter<MoviesItem>(items, listener) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): BaseMovieViewHolder =
        MovieOneViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_movie_category, parent, false)
        )

    override fun onBindViewHolder(holder: BaseMovieViewHolder, position: Int) {
        when(holder){
            is MovieOneViewHolder ->{
                holder.binding.apply {
                    items[position].also {
                        Glide.with(imageCategory).load(it.art).into(imageCategory)
                        movieName.text=it.title
                    }
                }
            }
        }
    }

    class MovieOneViewHolder(itemView: View) : BaseMovieViewHolder(itemView){
        val binding = ItemMovieCategoryBinding.bind(itemView)
    }


}