package com.example.classictube.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.classictube.R
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.databinding.ItemCategoryBinding

class CategoryAdapter(items:List<MoviesItem>, listener:HomeActionListener) : BaseRecyclerAdapter<MoviesItem>(items,listener) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): BaseMovieViewHolder = WatchMoviesViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_category,parent,false)
    )
    override fun onBindViewHolder(holder: BaseMovieViewHolder, position: Int) {
        when(holder){
            is WatchMoviesViewHolder ->{
                holder.binding.apply {

                }
            }
        }
    }
    class WatchMoviesViewHolder(itemView: View):BaseRecyclerAdapter.BaseMovieViewHolder(itemView){
        val binding = ItemCategoryBinding.bind(itemView)
    }
}
