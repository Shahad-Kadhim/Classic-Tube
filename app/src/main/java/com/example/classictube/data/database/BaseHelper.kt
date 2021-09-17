package com.example.classictube.data.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


abstract class BaseHelper (context: Context  ) : SQLiteOpenHelper(context,
    DB_NAME,
    null,
    DB_VERSION) {

    override fun onCreate(db: SQLiteDatabase?) {

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }





    companion object{
        private const val DB_NAME = "MovieDatabase"
        private const val DB_VERSION = 1
    }


}