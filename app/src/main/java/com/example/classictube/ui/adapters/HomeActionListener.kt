package com.example.classictube.ui.adapters

import com.example.classictube.data.domain.CategoryItem
import com.example.classictube.data.response.MoviesItem

interface  HomeActionListener{
    fun onClickMovie(movie:MoviesItem)
    fun onClickSeeMore(category: CategoryItem)
    fun onClickGoToSaved()
}