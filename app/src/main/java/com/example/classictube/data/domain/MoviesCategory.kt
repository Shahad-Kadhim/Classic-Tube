package com.example.classictube.data.domain

import com.google.gson.annotations.SerializedName


data class MoviesCategory(
    @SerializedName("description")
    val description: String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("image")
    val image: String?,
    @SerializedName("items")
    val moviesItems: List<MovieItem>,
    @SerializedName("title")
    val title: String
)
