package com.example.classictube.ui

import android.util.Log
import com.example.classictube.ui.model.Feed
import com.example.classictube.ui.model.MoviesCategory
import com.example.classictube.ui.model.MoviesItem
import com.google.gson.Gson
import okhttp3.*
import java.io.IOException

class Network {

    var listMoviesCategory : MutableList<MoviesCategory> = ArrayList()
    var listMovieItem: MutableList<MoviesItem> = ArrayList()
    val nameOfCategory : MutableList<String?> = ArrayList()

    fun makeRequestUsingOkHttp(){
        val url = "https://raw.githubusercontent.com/Bareq-altaamah/mock/main/classic.json"
        val request = Request.Builder()
            .url(url)
            .build()
        val client = OkHttpClient()
        val gson = Gson()
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException){
                Log.d("MAIN_ACTIVITY", "failed ${e.message}")}
            override fun onResponse(call: Call, response: Response) {
                val body = response.body?.string().toString()
                Log.v("MY_TAG",body)
                val homeFeed = gson.fromJson(body , Feed::class.java)
                homeFeed.feed?.get(2)?.let { Log.d("NOOR", it.toString()) }
            }
        })
    }
}
