package com.example.classictube.data

import com.example.classictube.data.domain.CategoryItem
import com.example.classictube.data.response.MoviesCategory

fun moviesCategoryFilter(title: String, categoryList: List<MoviesCategory>) =
    categoryList.filter { it.title == title }.first().moviesItems.apply {  forEach { it.movieCategoryName=title }}


fun getListsOfCategories(categoryList: List<MoviesCategory>): List<CategoryItem> {
    val list = categoryList.map { CategoryItem(it.title, moviesCategoryFilter(it.title, categoryList)) }
    val fullList = mutableListOf(
        CategoryItem("", categoryList.flatMap { it.moviesItems }.shuffled())
    ).also {
        it.addAll(list)
    }
    return fullList
}
