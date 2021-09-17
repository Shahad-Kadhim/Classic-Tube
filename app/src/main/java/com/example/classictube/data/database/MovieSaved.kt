package com.example.classictube.data.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.text.Spanned
import com.example.classictube.ui.util.MovieSaved

class MovieSaved(context: Context ) : BaseHelper(context ) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(MoviesSave())
    }

    private fun MoviesSave() = "CREATE TABLE ${MovieSaved.TABLE_NAME} ( " +
            "${MovieSaved.DESCRIPTION_CATEGORY} TEXT , " +
            "${MovieSaved.IMAGE_CATEGORY} TEXT , " +
            "${MovieSaved.ID_CATEGORY} INTEGER PRIMARY KEY , " +
            "${MovieSaved.MOVIES_ITEMS_CATEGORY} TEXT , " +
            "${MovieSaved.TITLE_CATEGORY} TEXT , " +
            "${MovieSaved.ID_ITEM} INTEGER PRIMARY KEY , " +
            "${MovieSaved.ART_ITEM} TEXT , " +
            "${MovieSaved.YEAR_ITEM} TEXT , " +
            "${MovieSaved.URL_ITEM} TEXT , " +
            "${MovieSaved.DESCRIPTION_ITEM} TEXT , " +
            "${MovieSaved.DIRECTOR_ITEM} TEXT , " +
            "${MovieSaved.DURATION_ITEM} TEXT, " +
            "${MovieSaved.TITLE_ITEM} TEXT , " +
            "${MovieSaved.RATINGS_ITEM} TEXT , " +


            ")"

     fun insertMovieSave(item: List<MovieSaved>) {
            val db = this.writableDatabase
            val contentValues = ContentValues().apply {
                put(MovieSaved.DESCRIPTION_CATEGORY, item[0])
                put(MovieSaved.IMAGE_CATEGORY, item[1])
                put(MovieSaved.ID_CATEGORY, item[2])
                put(MovieSaved.MOVIES_ITEMS_CATEGORY, item[3])
                put(MovieSaved.TITLE_CATEGORY, item[4])
                put(MovieSaved.ID_ITEM, item[5])
                put(MovieSaved.ART_ITEM, item[6])
                put(MovieSaved.YEAR_ITEM, item[7])
                put(MovieSaved.URL_ITEM, item[8])
                put(MovieSaved.DIRECTOR_ITEM, item[9])
                put(MovieSaved.TITLE_ITEM, item[10])
                put(MovieSaved.RATINGS_ITEM, item[11])
            }
            db.insert( MovieSaved.TABLE_NAME, null, contentValues)
        }


    fun deleteMovieSave(ID_ITEM: String) : Int {
        val db = this.writableDatabase
        return db.delete(
            MovieSaved.TABLE_NAME,
            "ID = ?",
            arrayOf(ID_ITEM)
        )
    }

    val allMovieSave : Cursor
        get() {
            val db = this.readableDatabase
            val res = db.rawQuery("SELECT * FROM " + MovieSaved.TABLE_NAME, null)
            return res
        }

    private fun ContentValues.put(Movie: Any, movieWatched: MovieSaved) {}

}