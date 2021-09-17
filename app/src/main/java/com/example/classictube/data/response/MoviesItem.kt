package com.example.classictube.data.response


import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import java.util.ArrayList

@SuppressLint("ParcelCreator")
data class MoviesItem(
    @SerializedName("art")
    val art: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("director")
    val director: String?,
    @SerializedName("duration")
    val duration: Int?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("ratings")
    val ratings: ArrayList<String>?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("year")
    val year: Int?
):Parcelable {
    override fun describeContents() =0
    override fun writeToParcel(p0: Parcel?, p1: Int) {
    }

    lateinit var movieCategoryName:String
}