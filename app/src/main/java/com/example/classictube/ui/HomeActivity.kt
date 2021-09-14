package com.example.classictube.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.classictube.R
import com.example.classictube.data.domain.HomeItem
import com.example.classictube.data.domain.MovieItem
import com.example.classictube.data.domain.MoviesCategory
import com.example.classictube.data.enum.HomeItemType
import com.example.classictube.ui.adapter.HomeActionListener
import com.example.classictube.ui.adapter.movieAdapters.NestedAdapter

class HomeActivity : AppCompatActivity(),HomeActionListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val ll= mutableListOf<HomeItem>().apply {
            add(
                HomeItem(
                    listOf(
                        MoviesCategory(null,null,null, listOf(MovieItem(),MovieItem()),"CategoryOne"),
                        MoviesCategory(null,null,null, listOf(MovieItem(),MovieItem()),"CategoryOne"),
                        MoviesCategory(null,null,null, listOf(MovieItem(),MovieItem()),"CategoryOne"),
                        ),
                    HomeItemType.TYPE_MOVIE
                ),
            )
            add(
                HomeItem(
                    listOf(
                        MoviesCategory(null,null,null, listOf(MovieItem(),MovieItem()),"CategoryOne"),
                        MoviesCategory(null,null,null, listOf(MovieItem(),MovieItem()),"CategoryOne"),
                        MoviesCategory(null,null,null, listOf(MovieItem(),MovieItem()),"CategoryOne"),
                        ),
                    HomeItemType.TYPE_MOVIES_ONE
                ),
            )
            add(
                HomeItem(
                    listOf(
                        MoviesCategory(null,null,null, listOf(MovieItem(),MovieItem()),"CategoryOne"),
                        MoviesCategory(null,null,null, listOf(MovieItem(),MovieItem()),"CategoryOne"),
                        MoviesCategory(null,null,null, listOf(MovieItem(),MovieItem()),"CategoryOne"),
                        ),
                    HomeItemType.TYPE_MOVIES_ONE
                ),
            )
        }
        findViewById<RecyclerView>(R.id.sub_view_container).apply {
            adapter=NestedAdapter(ll,this@HomeActivity)
        }
    }
}