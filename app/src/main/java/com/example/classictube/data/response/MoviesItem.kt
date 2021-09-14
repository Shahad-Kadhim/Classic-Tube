package com.example.classictube.data.response


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import java.util.ArrayList

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
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.createStringArrayList(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(art)
        parcel.writeString(description)
        parcel.writeString(director)
        parcel.writeValue(duration)
        parcel.writeString(id)
        parcel.writeStringList(ratings)
        parcel.writeString(title)
        parcel.writeString(url)
        parcel.writeValue(year)
    }

    override fun describeContents(): Int {
        return 0
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