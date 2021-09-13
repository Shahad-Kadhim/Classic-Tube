package com.example.classictube.ui

import android.util.Log
import com.example.classictube.ui.model.Feed
import com.example.classictube.ui.model.MoviesCategory
import com.example.classictube.ui.model.MoviesItem
import com.google.gson.GsonBuilder
import okhttp3.*
import java.io.IOException

class Network {

    var listOfMoClasses : MutableList<MoviesCategory> = ArrayList()
    var listOfMoDet: MutableList<MoviesItem> = ArrayList()

    fun makeRequestUsingOkHttp() {
        val url = "https://raw.githubusercontent.com/Bareq-altaamah/mock/main/classic.json"
        val request = Request.Builder()
            .url(url)
            .build()
        val client = OkHttpClient()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.i("MAIN_ACTIVITY", "failed ${e.message}")//////
            }
            override fun onResponse(call: Call, response: Response) {

                val body = response.body?.string().toString()
                val gson = GsonBuilder().create()
                val homeFeed = gson.fromJson(body, Feed::class.java)

                for (i in 0..2){
                    val item = homeFeed.feed?.get(i)
                    if (item != null) {
                        item.moviesItems?.let { listOfMoDet.addAll(it)
                            Log.i("MOVIES_ITEMS", item.toString())///////
                        }
                    }
                }
                homeFeed.feed?.let { listOfMoClasses.addAll(it) }

//                moviesDetFilter("chaplin_rink").forEach{
//                    Log.i("FilterDet","$it")
//                }
//                moviesCatFilter("1910's Feature Films").forEach{
//                    Log.i("FilterMo","$it")
//                }
            }
        })
    }
}
