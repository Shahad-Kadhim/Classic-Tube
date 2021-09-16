package com.example.classictube.data.domain

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable
import com.example.classictube.data.response.MoviesItem

@SuppressLint("ParcelCreator")
class CategoryItem (
    val categoryName:String,
    val movies:List<MoviesItem>,
):Parcelable {
    override fun describeContents()=0

    override fun writeToParcel(p0: Parcel?, p1: Int) {
    }
}