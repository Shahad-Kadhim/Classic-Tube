package com.example.classictube.data.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.util.*


class MovieDbHelper(context: Context) : SQLiteOpenHelper (context, DB_NAME , null, DB_VERSION){


    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(createDatabase())
    }


    private fun createDatabase() = "CREATE TABLE ${MovieDB.TABLE_NAME} ( " +
            "${MovieDB.DESCRIPTION_CATEGORY} TEXT , " +
            "${MovieDB.IMAGE_CATEGORY} TEXT , " +
            "${MovieDB.ID_CATEGORY} INTEGER PRIMARY KEY , " +
            "${MovieDB.MOVIES_ITEMS_CATEGORY} TEXT , " +
            "${MovieDB.TITLE_CATEGORY} TEXT , " +
            "${MovieDB.ID_ITEM} INTEGER PRIMARY KEY , " +
            "${MovieDB.ART_ITEM} TEXT , " +
            "${MovieDB.YEAR_ITEM} TEXT , " +
            "${MovieDB.URL_ITEM} TEXT , " +
            "${MovieDB.DESCRIPTION_ITEM} TEXT , " +
            "${MovieDB.DIRECTOR_ITEM} TEXT , " +
            "${MovieDB.DURATION_ITEM} TEXT, " +
            "${MovieDB.TITLE_ITEM} TEXT , " +
            "${MovieDB.RATINGS_ITEM} TEXT , " +


    ")"


    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {}

    fun insertData(ID_CATEGORY: String, ID_ITEM: String) {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(MovieDB.TITLE_CATEGORY, ID_CATEGORY)
        contentValues.put(MovieDB.TITLE_ITEM, ID_ITEM)
        db.insert( MovieDB.TABLE_NAME, null, contentValues)
    }

    fun deleteData(ID_ITEM: String) : Int {
        val db = this.writableDatabase
        return db.delete(
            MovieDB.TABLE_NAME,
            "ID = ?",
            arrayOf(ID_ITEM: String)
        )
    }

    val allData : Cursor
        get() {
            val db = this.writableDatabase
            val res = db.rawQuery("SELECT * FROM " + MovieDB.TABLE_NAME, null)
            return res
        }



    companion object{
        private const val DB_NAME = "MovieDatabase"
        private const val DB_VERSION = 1
    }
}