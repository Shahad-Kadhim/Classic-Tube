package com.example.classictube.data

import android.util.Log
import com.example.classictube.data.database.BaseHelper
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.util.DBConstant
import com.example.classictube.util.toContentValues

lateinit var db:BaseHelper
fun insertIntoSaved(movie:MoviesItem){
    db.insertIntoTable(movie.toContentValues(),DBConstant.SAVE_TABLE_NAME)
}

fun insertIntoWatched(movie:MoviesItem){
    db.insertIntoTable(movie.toContentValues(),DBConstant.WATCH_TABLE_NAME)
}

fun getSavedMovie(){
    db.getMovieFromTable(DBConstant.SAVE_TABLE_NAME).apply {
        if(moveToFirst()){
            Log.i("TAG",getString(0))
            Log.i("TAG",getString(1))
            Log.i("TAG",getString(2))
            Log.i("TAG",getString(3))
            Log.i("TAG",getString(4))
            Log.i("TAG",getString(5))
            Log.i("TAG",getString(6))
        }

    }

}
