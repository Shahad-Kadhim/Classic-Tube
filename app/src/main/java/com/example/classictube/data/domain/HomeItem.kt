package com.example.classictube.data.domain

import com.example.classictube.data.domain.enum.HomeItemType

data class HomeItem <T> (
    val item : T,
    val type : HomeItemType
        )