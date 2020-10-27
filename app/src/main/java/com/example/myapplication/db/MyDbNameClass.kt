package com.example.myapplication.db

import android.provider.BaseColumns

object MyDbNameClass : BaseColumns {
    //const val TABLE_NAME = "hedel"
    const val TUOT_NAME = "tNimi"
    const val TUOT_KPL = "kpl"
    const val OSASTO_NAME = "oName"
    const val DATABASE_VERSION = 17
    const val DATABASE_NAME = "ostos_base.db"

    const val CREAT_TABLE_HEDEL = "CREATE TABLE IF NOT EXISTS hedel (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY, $TUOT_NAME TEXT, $TUOT_KPL TEXT)"
    const val DELITE_DATA_HEDEL = "DROP TABLE IF EXISTS hedel"

    const val CREAT_TABLE_MYLIST = "CREATE TABLE IF NOT EXISTS mylist (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY, $TUOT_NAME TEXT, $TUOT_KPL TEXT)"
    const val DELITE_DATA_MYLIST = "DROP TABLE IF EXISTS mylist"

    const val CREAT_TABLE_LEIV = "CREATE TABLE IF NOT EXISTS leiv (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY, $TUOT_NAME TEXT, $TUOT_KPL TEXT)"
    const val DELITE_DATA_LEIV = "DROP TABLE IF EXISTS leiv"

    const val CREAT_TABLE_LEMMIKI = "CREATE TABLE IF NOT EXISTS lemmiki (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY, $TUOT_NAME TEXT, $TUOT_KPL TEXT)"
    const val DELITE_DATA_LEMMIKI = "DROP TABLE IF EXISTS lemmiki"

    const val CREAT_TABLE_LIHA = "CREATE TABLE IF NOT EXISTS liha (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY, $TUOT_NAME TEXT, $TUOT_KPL TEXT)"
    const val DELITE_DATA_LIHA = "DROP TABLE IF EXISTS liha"

    const val CREAT_TABLE_MAITO = "CREATE TABLE IF NOT EXISTS maito (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY, $TUOT_NAME TEXT, $TUOT_KPL TEXT)"
    const val DELITE_DATA_MAITO = "DROP TABLE IF EXISTS maito"

    const val CREAT_TABLE_MAKEISET = "CREATE TABLE IF NOT EXISTS makeiset (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY, $TUOT_NAME TEXT, $TUOT_KPL TEXT)"
    const val DELITE_DATA_MAKEISET = "DROP TABLE IF EXISTS makeiset"

    const val CREAT_TABLE_TALOUS = "CREATE TABLE IF NOT EXISTS talous (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY, $TUOT_NAME TEXT, $TUOT_KPL TEXT)"
    const val DELITE_DATA_TALOUS = "DROP TABLE IF EXISTS talous"

    const val CREAT_TABLE_VIHAN = "CREATE TABLE IF NOT EXISTS vihan (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY, $TUOT_NAME TEXT, $TUOT_KPL TEXT)"
    const val DELITE_DATA_VIHAN = "DROP TABLE IF EXISTS vihan"

}