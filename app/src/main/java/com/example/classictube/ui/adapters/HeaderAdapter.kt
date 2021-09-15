package com.example.classictube.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.classictube.R
import com.example.classictube.data.domain.CategoryItem
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.databinding.ItemMovieHeaderBinding
import com.example.classictube.databinding.ItemRecycleHeaderBinding


class HeaderAdapter(items: List<MoviesItem>, listener: HomeActionListener) :
    BaseRecyclerAdapter<MoviesItem>(items,listener) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): BaseMovieViewHolder =
        MovieViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_movie_header, parent, false)
        )

    override fun onBindViewHolder(holder: BaseMovieViewHolder, position: Int) {
        when (holder){
            is MovieViewHolder ->{
                holder.binding.apply {
                    items[position].also {
                        this.movieName.text=it.title
                        Glide.with(this.imageMovieHeader).load(it.art).into(this.imageMovieHeader)
                        this.descriptionMovieText.text=it.description
                        this.movieTime.text=it.duration.toString()
                        this.year.text=it.year.toString()
                    }
                }
            }
        }
    }

    class MovieViewHolder(itemView: View) : BaseMovieViewHolder(itemView){
        val binding =ItemMovieHeaderBinding.bind(itemView)
    }

}