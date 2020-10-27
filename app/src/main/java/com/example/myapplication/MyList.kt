package com.example.myapplication

import android.content.DialogInterface
import android.media.AudioMetadata
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.Gravity
import android.view.View
import android.webkit.WebSettings
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.example.myapplication.db.MyDbManager
import kotlinx.android.synthetic.main.activity_hedel.*
import kotlinx.android.synthetic.main.activity_my_list.*

class MyList : AppCompatActivity()
{
    val myDbManager = MyDbManager(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_list)
        this.setTitle("My List")
    }

    fun createSimpleDialog(tNimi: String){
        val builder = AlertDialog.Builder(this )
        val myDbManager = MyDbManager(this)
        builder.setTitle(tNimi)
        builder.setMessage(R.string.del)

        builder.setPositiveButton("KYLLÄ"){ dialog: DialogInterface?, which: Int ->

            myDbManager.openDb()
            myDbManager.delFromDb("mylist", tNimi)
            myDbManager.closeDb()
            onResume()

        }
        builder.setNegativeButton("EI"){ dialog: DialogInterface?, which: Int ->

        }
        builder.show()
    }

    override fun onResume() {
        super.onResume()
        myDbManager.openDb()
        val dataList = myDbManager.readDbData("mylist")

        myList.removeAllViews()
        var id = 1
        for (item  in dataList){
            val tK = item.value.toString()
            var tN = item.key.toString()
            var dialTN = tN

            val btn =  Button(this)
            btn.id = (id)
            btn.gravity = Gravity.LEFT
            var tnL = 0

            while (tnL < 5){
                tN += ' '
                tnL++
            }
            btn.text = (tN +  tK + "kpl")
            btn.textSize = 20.toFloat()

            btn.setOnClickListener(object: View.OnClickListener {
                override fun onClick(v: View?) {
                    createSimpleDialog(dialTN)
                }
            })
            myList.addView(btn)
            id++
        }
        myDbManager.closeDb()
    }
}