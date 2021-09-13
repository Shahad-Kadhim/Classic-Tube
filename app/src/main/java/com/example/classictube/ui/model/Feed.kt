package com.example.classictube.ui.model


import com.google.gson.annotations.SerializedName

data class Feed(
    @SerializedName("backgrounds")
    val backgrounds: List<String>?,
    @SerializedName("feed")
    val feed: List<MoviesCategory>?
)
