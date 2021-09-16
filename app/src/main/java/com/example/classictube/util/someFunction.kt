package com.example.classictube.util

import android.content.ContentValues
import com.example.classictube.data.response.MoviesItem

fun MoviesItem.toContentValues() =
    ContentValues().apply {
        put(DBConstant.DESCRIPTION_KEY,description)
        put(DBConstant.IMAGE_KEY, art)
        put(DBConstant.ID_KEY, id)
        put(DBConstant.ART_KEY,art)
        put(DBConstant.YEAR_KEY, year.toString())
        put(DBConstant.URL_KEY,url)
        put(DBConstant.DIRECTOR_KEY, director)
        put(DBConstant.DURATION_KEY, duration.toString())
        put(DBConstant.TITLE_KEY, title)
        put(DBConstant.RATINGS_KEY, ratings?.first())
    }