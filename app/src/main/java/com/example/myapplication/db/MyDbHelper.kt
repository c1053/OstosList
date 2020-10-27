package com.example.myapplication.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDbHelper(context: Context): SQLiteOpenHelper(context, MyDbNameClass.DATABASE_NAME,
    null, MyDbNameClass.DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(MyDbNameClass.CREAT_TABLE_MYLIST)
        db?.execSQL(MyDbNameClass.CREAT_TABLE_HEDEL)
        db?.execSQL(MyDbNameClass.CREAT_TABLE_LEIV)
        db?.execSQL(MyDbNameClass.CREAT_TABLE_LEMMIKI)
        db?.execSQL(MyDbNameClass.CREAT_TABLE_LIHA)
        db?.execSQL(MyDbNameClass.CREAT_TABLE_MAITO)
        db?.execSQL(MyDbNameClass.CREAT_TABLE_MAKEISET)
        db?.execSQL(MyDbNameClass.CREAT_TABLE_TALOUS)
        db?.execSQL(MyDbNameClass.CREAT_TABLE_VIHAN)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL(MyDbNameClass.DELITE_DATA_MYLIST)
        db?.execSQL(MyDbNameClass.DELITE_DATA_HEDEL)
        db?.execSQL(MyDbNameClass.DELITE_DATA_LEIV)
        db?.execSQL(MyDbNameClass.DELITE_DATA_LEMMIKI)
        db?.execSQL(MyDbNameClass.DELITE_DATA_LIHA)
        db?.execSQL(MyDbNameClass.DELITE_DATA_MAITO)
        db?.execSQL(MyDbNameClass.DELITE_DATA_MAKEISET)
        db?.execSQL(MyDbNameClass.DELITE_DATA_TALOUS)
        db?.execSQL(MyDbNameClass.DELITE_DATA_VIHAN)

        onCreate(db)
    }
}