package com.example.myapplication

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.db.MyDbManager

class AlertD(context: Context)  {

    public fun createSimpleDialog(tNimi: String, actyv: Context, tabName: String){
        val builder = AlertDialog.Builder(actyv )
        val myDbManager = MyDbManager(actyv)
        builder.setTitle(tNimi)
        builder.setMessage(R.string.kpl)
        builder.setView(R.layout.fordialog)
        builder.setNeutralButton("poista"){ dialog: DialogInterface?, which: Int ->
            myDbManager.openDb()
            myDbManager.delFromDb(tabName, tNimi)
            myDbManager.closeDb()
            return@setNeutralButton
        }
        builder.setPositiveButton("Lisää"){ dialog: DialogInterface?, which: Int ->

        }
        builder.setNegativeButton("Cancel"){ dialog: DialogInterface?, which: Int ->

        }
        builder.show()
    }

}