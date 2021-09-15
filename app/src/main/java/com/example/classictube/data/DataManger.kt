package com.example.classictube.data
import com.example.classictube.data.response.MoviesCategory

fun moviesCategoryFilter(title:String,categoryList:List<MoviesCategory>) =
    categoryList.filter { it.title == title }.first().moviesItems

private var categoryNames:List<String>?=null

fun getNamesOfCategories(categoryList: List<MoviesCategory>): List<String>? {
    if(categoryNames==null){
        categoryNames=categoryList.map { it.title }
    }
    return categoryNames
}
