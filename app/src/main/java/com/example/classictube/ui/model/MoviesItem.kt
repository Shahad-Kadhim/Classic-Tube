package com.example.classictube.ui.model


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class MoviesItem (
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
    val ratings: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("year")
    val year: Int?
):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int
    )

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(p0: Parcel?, p1: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<MoviesItem> {
        override fun createFromParcel(parcel: Parcel): MoviesItem {
            return MoviesItem(parcel)
        }

        override fun newArray(size: Int): Array<MoviesItem?> {
            return arrayOfNulls(size)
        }
    }
}
