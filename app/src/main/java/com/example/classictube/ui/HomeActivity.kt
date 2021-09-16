package com.example.classictube.ui


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.classictube.data.Network
import com.example.classictube.data.database.BaseHelper
import com.example.classictube.data.database.MovieSaved
import com.example.classictube.data.db
import com.example.classictube.data.getSavedMovie
import com.example.classictube.data.insertIntoSaved
import com.example.classictube.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding
    lateinit var database: MovieSaved


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        db = BaseHelper(applicationContext)

        Network.makeRequest({
            Log.i("TAG",it.feed!![0].moviesItems[0].toString())
               insertIntoSaved(it.feed!![0].moviesItems[0])
//            getSavedMovie()
        },{
            Log.i("TAG",it)

        })


    }
}




