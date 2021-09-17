package com.example.classictube.data.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import com.example.classictube.ui.util.MovieWatched

class MovieWatched(context: Context) : BaseHelper(context )  {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(MoviesWatch())
    }

    private fun MoviesWatch() = "CREATE TABLE ${MovieWatched.TABLE_NAME} ( " +
            "${MovieWatched.DESCRIPTION_CATEGORY} TEXT , " +
            "${MovieWatched.IMAGE_CATEGORY} TEXT , " +
            "${MovieWatched.ID_CATEGORY} INTEGER PRIMARY KEY , " +
            "${MovieWatched.MOVIES_ITEMS_CATEGORY} TEXT , " +
            "${MovieWatched.TITLE_CATEGORY} TEXT , " +
            "${MovieWatched.ID_ITEM} INTEGER PRIMARY KEY , " +
            "${MovieWatched.ART_ITEM} TEXT , " +
            "${MovieWatched.YEAR_ITEM} TEXT , " +
            "${MovieWatched.URL_ITEM} TEXT , " +
            "${MovieWatched.DESCRIPTION_ITEM} TEXT , " +
            "${MovieWatched.DIRECTOR_ITEM} TEXT , " +
            "${MovieWatched.DURATION_ITEM} TEXT, " +
            "${MovieWatched.TITLE_ITEM} TEXT , " +
            "${MovieWatched.RATINGS_ITEM} TEXT , " +


            ")"

    fun insertMovieWatch(Movie : List<MovieWatched>) {
        val db = this.writableDatabase
        val contentValues = ContentValues().apply {
            put(MovieWatched.DESCRIPTION_CATEGORY, Movie[0])
            put(MovieWatched.IMAGE_CATEGORY, Movie[1])
            put(MovieWatched.ID_CATEGORY, Movie[2])
            put(MovieWatched.MOVIES_ITEMS_CATEGORY, Movie[3])
            put(MovieWatched.TITLE_CATEGORY, Movie[4])
            put(MovieWatched.ID_ITEM, Movie[5])
            put(MovieWatched.ART_ITEM, Movie[6])
            put(MovieWatched.YEAR_ITEM, Movie[7])
            put(MovieWatched.URL_ITEM, Movie[8])
            put(MovieWatched.DIRECTOR_ITEM, Movie[9])
            put(MovieWatched.TITLE_ITEM, Movie[10])
            put(MovieWatched.RATINGS_ITEM, Movie[11])
        }
        db.insert( MovieWatched.TABLE_NAME, null, contentValues)
    }


    fun deleteMovieWatch(ID_ITEM: String) : Int {
        val db = this.writableDatabase
        return db.delete(
            MovieWatched.TABLE_NAME,
            "ID = ?",
            arrayOf(ID_ITEM)
        )
    }

    val allMovieSave : Cursor
        get() {
            val db = this.readableDatabase
            val res = db.rawQuery("SELECT * FROM " + MovieWatched.TABLE_NAME, null)
            return res
        }

    private fun ContentValues.put(Movie: Any, movieWatched: MovieWatched) {}

}