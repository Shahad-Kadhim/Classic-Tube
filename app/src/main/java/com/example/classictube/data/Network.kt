package com.example.classictube.data

import android.util.Log
import com.example.classictube.data.response.Feed
import com.example.classictube.data.response.MoviesCategory
import com.google.gson.Gson
import okhttp3.*
import java.io.IOException

object Network {

    private var categories : List<MoviesCategory>?=null
    private var nameOfCategories : List<String>?=null

    private const val URL = "https://raw.githubusercontent.com/Bareq-altaamah/mock/main/classic.json"
    private val client = OkHttpClient()
    private val gson = Gson()

    fun makeRequest() {
        val request = Request.Builder()
            .url(URL)
            .build()
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d("MAIN_ACTIVITY", "failed ${e.message}")
            }

            override fun onResponse(call: Call, response: Response) {
                val body = response.body?.string().toString()
                val homeFeed = gson.fromJson(body, Feed::class.java)
                homeFeed.feed?.let { categories = it }
                nameOfCategories = homeFeed.feed?.map { it.title }
            }
        })
    }

    fun categories() = categories
    fun categoriesName()= nameOfCategories

}
