package com.example.classictube.data.response


import com.google.gson.annotations.SerializedName

data class MoviesCategory(
    @SerializedName("description")
    val description: String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("image")
    val image: String?,
    @SerializedName("items")
    val moviesItems: List<MoviesItem>,
    @SerializedName("title")
    val title: String
)