package com.example.myapplication.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AlertDialog

class MyDbManager(context: Context) {
    val myDbHelper = MyDbHelper(context)
    var db: SQLiteDatabase? = null


    fun openDb(){
        db = myDbHelper.writableDatabase
    }

    fun insertToDb(tNimi: String, tableNa: String, kpl: String){

        val values = ContentValues().apply {
            put(MyDbNameClass.TUOT_NAME, tNimi)
            put(MyDbNameClass.TUOT_KPL, kpl)
        }
        db?.insert(tableNa, null, values)
    }

    fun delFromDb(tabName: String, tuotName: String){

        var rowsDeleted = db?.delete(tabName, "tNimi = '" + tuotName + "'", null)
      return

    }

    fun readDbData(tableNa: String) : Map<String, String>{
            // val dataList = ArrayList<String>()
            var dataList = mapOf<String, String>()
            val cursor = db?.query(
                tableNa, null, null,
                null, null, null, null
            )
            while (cursor?.moveToNext()!!) {
                val dataNimi = cursor.getString(cursor.getColumnIndex(MyDbNameClass.TUOT_NAME))
                val dataKpl = cursor.getString(cursor.getColumnIndex(MyDbNameClass.TUOT_KPL))

                dataList += mapOf<String, String>(dataNimi to dataKpl)
                // dataList.add(dataNimi.toString())
            }
            cursor.close()
            return dataList
    }
    fun closeDb(){
        myDbHelper.close()
    }
}