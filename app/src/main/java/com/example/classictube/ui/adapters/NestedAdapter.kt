package com.example.classictube.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.classictube.R
import com.example.classictube.data.domain.CategoryItem
import com.example.classictube.data.response.MoviesCategory
import com.example.classictube.databinding.*
import com.mig35.carousellayoutmanager.CarouselLayoutManager
import com.mig35.carousellayoutmanager.CarouselZoomPostLayoutListener
import java.lang.Exception

class  NestedAdapter (items: List<List<MoviesCategory>>, listener: HomeActionListener):
    BaseRecyclerAdapter<List<MoviesCategory>>(items, listener) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseMovieViewHolder {
        return when(viewType){
            VIEW_TYPE_HEADER -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycle_header, parent, false)
                HeaderViewHolder(view)
            }
            VIEW_TYPE_CATEGORIES -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycle_category, parent, false)
                CategoryViewHolder(view)
            }
            else -> throw Exception("UNKNOWN VIEW TYPE")
        }
    }

    override fun onBindViewHolder(holder: BaseMovieViewHolder, position: Int) {
        val currentItem=items[position].map { CategoryItem(it.title,it.moviesItems)}
        when (holder) {
            is HeaderViewHolder -> {
                holder.binding.recyclerMoviesHeader.apply {
                    adapter= HeaderAdapter(currentItem,listener)

                    //recycler header motion
                    val layoutManager = CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL)
                    this.layoutManager = layoutManager
                    this.setHasFixedSize(true)
                    layoutManager.setPostLayoutListener(CarouselZoomPostLayoutListener())
                }


            }
            is CategoryViewHolder -> {
                holder.binding.recyclerMoviesCategory.apply {
                    adapter= CategoryAdapter(currentItem,listener)
                }
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(position){
            0 -> VIEW_TYPE_HEADER
            else -> VIEW_TYPE_CATEGORIES
        }
    }

    class CategoryViewHolder(itemView: View) : BaseMovieViewHolder(itemView){
        val binding = ItemRecycleCategoryBinding.bind(itemView)
    }

    class HeaderViewHolder(itemView: View) : BaseMovieViewHolder(itemView){
        val binding = ItemRecycleHeaderBinding.bind(itemView)
    }

    companion object{
        private const val VIEW_TYPE_HEADER = 1
        private const val VIEW_TYPE_CATEGORIES = 2
    }

}