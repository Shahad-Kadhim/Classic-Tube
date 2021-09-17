package com.example.classictube.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.classictube.R
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.databinding.ItemCategoryBinding

class CategoryAdapter(items:List<MoviesItem>, listener:HomeActionListener) : BaseRecyclerAdapter<MoviesItem>(items,listener) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): BaseMovieViewHolder = CategoryViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_category,parent,false)
    )
    override fun onBindViewHolder(holder: BaseMovieViewHolder, position: Int) {
        when(holder){
            is CategoryViewHolder ->bindLayout(holder,items[position])
            }
        }

    private fun bindLayout(holder: CategoryViewHolder, movie: MoviesItem) {
        holder.binding.apply {
            this.movieName.text=movie.title
            year.text=movie.year.toString()
            Glide.with(imageMovie).load(movie.art).into(imageMovie)
            categoryName.text=movie.movieCategoryName
        }
    }

    class CategoryViewHolder(itemView: View):BaseRecyclerAdapter.BaseMovieViewHolder(itemView){
        val binding = ItemCategoryBinding.bind(itemView)
    }
}


