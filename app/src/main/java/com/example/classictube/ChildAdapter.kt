package com.example.classictube

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.classictube.databinding.ItemAddMovieBinding
import com.example.classictube.databinding.ItemRecyclerBinding

class ChildAdapter(private val items: List<child>,private val listener: ParentActionsListener) : RecyclerView.Adapter<ChildAdapter.BaseItemMovieViewHolder>()  {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseItemMovieViewHolder {
            return when(viewType){
               VIEW_TYPE_ADD_ITEM_MOVIE-> {
                    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_add_movie, parent, false)
                    AddItemMovieViewHolder(view)
                }
                VIEW_TYPE_ITEM_MOVIE -> {
                   val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
                    itemMovieViewHolder(view)
                }
                else -> throw Exception("UNKNOWN VIEW TYPE")
            }
       }

        override fun onBindViewHolder(holder: BaseItemMovieViewHolder, position: Int) {
            when(holder){
                is itemMovieViewHolder -> bindItemMovie(holder, position)
            }
       }


        private fun bindItemMovie(holder: itemMovieViewHolder, position: Int){
            val currentItemMovie = items[position-1]
            holder.binding.apply{
                movieName.text = currentItemMovie.movieName
                Glide.with(this.root.context).load(currentItemMovie.movieUrl).into(imageMovies)
                root.setOnClickListener {  }
            }
        }

        override fun getItemViewType(position: Int): Int {
            return when(position){
               0 -> VIEW_TYPE_ADD_ITEM_MOVIE
                else -> VIEW_TYPE_ITEM_MOVIE
            }
        }

        override fun getItemCount() = items.size + 1

        abstract class BaseItemMovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
        class AddItemMovieViewHolder(itemView: View) : BaseItemMovieViewHolder(itemView) {
            val binding = ItemAddMovieBinding.bind(itemView)

        }
        class itemMovieViewHolder(itemView: View) : BaseItemMovieViewHolder(itemView){
            val binding = ItemRecyclerBinding.bind(itemView)

        }

        companion object{
            private const val VIEW_TYPE_ADD_ITEM_MOVIE = 1
            private const val VIEW_TYPE_ITEM_MOVIE = 2
        }
    }

