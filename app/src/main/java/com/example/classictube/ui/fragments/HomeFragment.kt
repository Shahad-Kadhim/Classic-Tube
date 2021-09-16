package com.example.classictube.ui.fragments

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.example.classictube.R
import com.example.classictube.data.response.MoviesCategory
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.databinding.FragmentHomeBinding
import com.example.classictube.ui.adapters.HomeActionListener
import com.example.classictube.ui.adapters.NestedAdapter


class HomeFragment : BaseFragment<FragmentHomeBinding>(), HomeActionListener {

    override val LOG_TAG: String = "Home_Fragment"
    override val bindingInflater: (LayoutInflater) ->
    FragmentHomeBinding = FragmentHomeBinding::inflate

    override fun addCallbacks() {
        val ll = mutableListOf<List<MoviesCategory>>().apply {
            add(
                listOf(
                    MoviesCategory(null, null, null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)), "CategoryOne"),
                    MoviesCategory(null, null, null, listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)), "CategoryOne"),
                    MoviesCategory(null, null, null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)), "CategoryOne"),
                    MoviesCategory(null, null, null, listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                        MoviesItem(null, null, null, null, null, null, null, null, null)), "CategoryOne"),
                    MoviesCategory(null, null, null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)), "CategoryOne"),
                    MoviesCategory(null, null, null, listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                        MoviesItem(null, null, null, null, null, null, null, null, null)), "CategoryOne"),
                    MoviesCategory(null, null, null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)), "CategoryOne"),
                    MoviesCategory(null, null, null, listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                        MoviesItem(null, null, null, null, null, null, null, null, null)), "CategoryOne"),
                    MoviesCategory(null, null, null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)), "CategoryOne"),
                    MoviesCategory(null, null, null, listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                        MoviesItem(null, null, null, null, null, null, null, null, null)), "CategoryOne"),
                )
            )
            add(
                listOf(
                    MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"),
                    MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"),
                    MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"), MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"), MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"), MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"), MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"),
                )

            )
            add(
                listOf(
                    MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"),
                    MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"),
                    MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"), MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"), MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"), MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"),
                )
            )

            add(
                listOf(
                    MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"),
                    MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"),
                    MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"), MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"), MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"), MoviesCategory(null,
                        null,
                        null,
                        listOf(MoviesItem(null, null, null, null, null, null, null, null, null),
                            MoviesItem(null, null, null, null, null, null, null, null, null)),
                        "CategoryOne"),
                )
            )
        }
        val adapter = NestedAdapter(ll, this)
        binding?.recyclerNested?.adapter = adapter



    }

    override fun setUp() {}
}









