package com.example.classictube.data.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.util.DBConstant
import com.example.classictube.util.toContentValues


open class BaseHelper (context: Context  ) : SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(createTable(DBConstant.SAVE_TABLE_NAME))
        db?.execSQL(createTable(DBConstant.WATCH_TABLE_NAME))
    }

    private fun createTable(tableName: String) =
        "CREATE TABLE $tableName ( " +
                "ID_I INTEGER   , " +
                "${DBConstant.DESCRIPTION_KEY} TEXT , " +
                "${DBConstant.IMAGE_KEY} TEXT , " +
                "${DBConstant.ID_KEY} TEXT , " +
                "${DBConstant.ART_KEY} TEXT , " +
                "${DBConstant.YEAR_KEY} TEXT , " +
                "${DBConstant.URL_KEY} TEXT , " +
                "${DBConstant.DIRECTOR_KEY} TEXT , " +
                "${DBConstant.DURATION_KEY} TEXT, " +
                "${DBConstant.TITLE_KEY} TEXT , " +
                "${DBConstant.RATINGS_KEY} TEXT " +
                ")"



    fun insertIntoTable(contentValues: ContentValues,tableName:String) {
        this.writableDatabase.insert( tableName, null, contentValues)
    }

    fun deleteMovieFromTable(ID_ITEM: String,tableName: String) : Int {
        val db = this.writableDatabase
        return db.delete(
            tableName,
            "${DBConstant.ID_KEY} = ?",
            arrayOf(ID_ITEM)
        )
    }

    fun getMovieFromTable(tableName:String) :Cursor=
        this.readableDatabase.rawQuery("SELECT * FROM $tableName", null)

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    companion object{
        private const val DB_NAME = "MovieDatabase"
        private const val DB_VERSION = 1
    }


}