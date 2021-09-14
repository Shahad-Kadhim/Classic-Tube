package com.example.classictube.data.domain

import com.example.classictube.data.enum.HomeItemType

data class HomeItem  (
    val item : List<MoviesCategory>,
    val type : HomeItemType,
        )