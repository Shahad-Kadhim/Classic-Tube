package com.example.classictube.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.classictube.R
import com.example.classictube.data.response.MoviesCategory
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.ui.adapter.HomeActionListener
import com.example.classictube.ui.adapter.movieAdapters.NestedAdapter

class HomeActivity : AppCompatActivity(),HomeActionListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val ll= mutableListOf<List<MoviesCategory>>().apply {
            add(
                    listOf(
                        MoviesCategory(null,null,null, listOf(MoviesItem(null,null,null,null,null,null,null,null,null),MoviesItem(null,null,null,null,null,null,null,null,null)),"CategoryOne"),
                        MoviesCategory(null,null,null, listOf(MoviesItem(null,null,null,null,null,null,null,null,null),MoviesItem(null,null,null,null,null,null,null,null,null)),"CategoryOne"),
                        )
            )
            add(
                    listOf(
                        MoviesCategory(null,null,null, listOf(MoviesItem(null,null,null,null,null,null,null,null,null),MoviesItem(null,null,null,null,null,null,null,null,null)),"CategoryOne"),
                        MoviesCategory(null,null,null, listOf(MoviesItem(null,null,null,null,null,null,null,null,null),MoviesItem(null,null,null,null,null,null,null,null,null)),"CategoryOne"),
                    )

            )
            add(
                listOf(
                    MoviesCategory(null,null,null, listOf(MoviesItem(null,null,null,null,null,null,null,null,null),MoviesItem(null,null,null,null,null,null,null,null,null)),"CategoryOne"),
                    MoviesCategory(null,null,null, listOf(MoviesItem(null,null,null,null,null,null,null,null,null),MoviesItem(null,null,null,null,null,null,null,null,null)),"CategoryOne"),
                )
            )

        }
        findViewById<RecyclerView>(R.id.sub_view_container).apply {
            adapter= NestedAdapter(ll,this@HomeActivity)
        }
    }
}