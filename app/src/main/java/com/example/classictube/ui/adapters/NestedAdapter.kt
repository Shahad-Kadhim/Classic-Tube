package com.example.classictube.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.classictube.R
import com.example.classictube.data.domain.CategoryItem
import com.example.classictube.data.response.MoviesCategory
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.databinding.*
import com.mig35.carousellayoutmanager.CarouselLayoutManager
import com.mig35.carousellayoutmanager.CarouselZoomPostLayoutListener
import java.lang.Exception

class  NestedAdapter (items: List<CategoryItem>, listener: HomeActionListener):
    BaseRecyclerAdapter<CategoryItem>(items, listener) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=
        CategoryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_recycle_category, parent, false))

    override fun onBindViewHolder(holder: BaseMovieViewHolder, position: Int) {
        val currentItem=items[position]
        when (holder) {
            is CategoryViewHolder -> {
                holder.binding.categoryName.text=currentItem.categoryName
                holder.binding.recyclerMoviesCategory.apply {
                    adapter= CategoryAdapter(currentItem.movies,listener)
                }
            }
        }
    }

    class CategoryViewHolder(itemView: View) : BaseMovieViewHolder(itemView){
        val binding = ItemRecycleCategoryBinding.bind(itemView)
    }

}