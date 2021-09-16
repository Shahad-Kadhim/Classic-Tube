package com.example.classictube.data

import com.example.classictube.data.domain.CategoryItem
import com.example.classictube.data.response.MoviesCategory

fun moviesCategoryFilter(title: String, categoryList: List<MoviesCategory>) =
    categoryList.filter { it.title == title }.first().moviesItems

var fullList: List<CategoryItem>? = null//where we can use it?

fun getNamesOfCategories(categoryList: List<MoviesCategory>): List<CategoryItem> {
    val list = categoryList.map { CategoryItem(it.title, moviesCategoryFilter(it.title, categoryList)) }
    fullList = mutableListOf(
        CategoryItem("", categoryList.flatMap { it.moviesItems })
    ).also {
        it.addAll(list)
    }
    return list
}
