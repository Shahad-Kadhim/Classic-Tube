package com.example.classictube.data
import com.example.classictube.data.response.MoviesCategory

fun moviesCategoryFilter(title:String,categoryList:List<MoviesCategory>) =
    categoryList.filter { it.title == title }.first().moviesItems
