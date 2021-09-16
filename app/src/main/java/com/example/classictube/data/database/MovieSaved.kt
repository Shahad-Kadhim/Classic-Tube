package com.example.classictube.data.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.util.DBConstant

class MovieSaved(context: Context ) : BaseHelper(context ) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(MoviesSave())
    }

    private fun MoviesSave() = "CREATE TABLE ${DBConstant.SAVE_TABLE_NAME} ( " +
            "${DBConstant.DESCRIPTION_KEY} TEXT , " +
            "${DBConstant.IMAGE_KEY} TEXT , " +
            "${DBConstant.ID_KEY} INTEGER PRIMARY KEY , " +
            "${DBConstant.ART_KEY} TEXT , " +
            "${DBConstant.YEAR_KEY} TEXT , " +
            "${DBConstant.URL_KEY} TEXT , " +
            "${DBConstant.DESCRIPTION_KEY} TEXT , " +
            "${DBConstant.DIRECTOR_KEY} TEXT , " +
            "${DBConstant.DURATION_KEY} TEXT, " +
            "${DBConstant.TITLE_KEY} TEXT , " +
            "${DBConstant.RATINGS_KEY} TEXT , " +
            ")"

     fun insertMovieSave(movie: MoviesItem) {
            val db = this.writableDatabase
         val contentValues = ContentValues().apply {
             put(DBConstant.DESCRIPTION_KEY,movie.description)
             put(DBConstant.IMAGE_KEY, movie.art)
             put(DBConstant.ID_KEY, movie.id)
             put(DBConstant.ART_KEY, movie.art)
             put(DBConstant.YEAR_KEY, movie.year)
             put(DBConstant.URL_KEY,movie.url)
             put(DBConstant.DIRECTOR_KEY, movie.director)
             put(DBConstant.DURATION_KEY, movie.duration)
             put(DBConstant.TITLE_KEY, movie.title)
             put(DBConstant.RATINGS_KEY, movie.ratings?.first())
         }
            db.insert( DBConstant.SAVE_TABLE_NAME, null, contentValues)
        }


    fun deleteMovieSave(ID_ITEM: String) : Int {
        val db = this.writableDatabase
        return db.delete(
            DBConstant.SAVE_TABLE_NAME,
            "${DBConstant.ID_KEY} = ?",
            arrayOf(ID_ITEM)
        )
    }

    val allMovieSave : Cursor
        get() {
            val db = this.readableDatabase
            val res = db.rawQuery("SELECT * FROM " + DBConstant.SAVE_TABLE_NAME, null)
            return res
        }


}