package com.example.classictube.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.classictube.R
import com.example.classictube.data.domain.CategoryItem
import com.example.classictube.databinding.ItemMovieHeaderBinding


class HeaderAdapter(items: List<CategoryItem>, listener: HomeActionListener) :
    BaseRecyclerAdapter<CategoryItem>(items,listener) {
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
                }
            }
        }
    }

    class MovieViewHolder(itemView: View) : BaseMovieViewHolder(itemView){
        val binding = ItemMovieHeaderBinding.bind(itemView)
    }

}