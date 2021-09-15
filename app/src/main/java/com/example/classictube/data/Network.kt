package com.example.classictube.data

import com.example.classictube.data.response.Feed
import com.google.gson.Gson
import okhttp3.*
import java.io.IOException

object Network {

    private var nameOfCategories : List<String>?=null

    private const val URL = "https://raw.githubusercontent.com/Bareq-altaamah/mock/main/classic.json"
    private val client = OkHttpClient()
    private val gson = Gson()

    fun makeRequest(onResponse: (Feed) -> Unit,onError:(String) -> Unit) {
        val request = Request.Builder()
            .url(URL)
            .build()
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                onError(e.message.toString())
            }
            override fun onResponse(call: Call, response: Response) {
                val body = response.body?.string().toString()
                val homeFeed = gson.fromJson(body, Feed::class.java)
                nameOfCategories = homeFeed.feed?.map { it.title }
                onResponse(homeFeed)
            }
        })
    }
    fun categoriesName()= nameOfCategories

}
