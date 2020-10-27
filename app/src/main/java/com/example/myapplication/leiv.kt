package com.example.myapplication

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.example.myapplication.db.MyDbManager
import kotlinx.android.synthetic.main.activity_hedel.*
import kotlinx.android.synthetic.main.activity_hedel.btnList
import kotlinx.android.synthetic.main.activity_leiv.*

class leiv : AppCompatActivity() {

    val myDbManager = MyDbManager(this)
    val alertdi = AlertD(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leiv)
        this.setTitle("Leipomotuotteet")
    }

    override fun onResume() {
        super.onResume()
        myDbManager.openDb()
        val dataList = myDbManager.readDbData("leiv")
        btnList.removeAllViews()
        var id = 1
        for (item in dataList){
            val tN = item.key.toString()
            val btn =  Button(this)
            btn.id = (id)
            btn.text = tN
            btn.textSize = 20.toFloat()
            btn.setOnClickListener(object: View.OnClickListener {
                override fun onClick(v: View?) {
                    createSimpleDialog(tN, "leiv")

                }
            })
            btnList.addView(btn)
            id++
        }
        myDbManager.closeDb()
    }

    fun createSimpleDialog(tNimi: String, tabName: String){
        val builder = AlertDialog.Builder(this )
        val myDbManager = MyDbManager(this)
        builder.setTitle(tNimi)
        builder.setMessage(R.string.kpl)
        //builder.setView(R.layout.fordialog)
        var  input = EditText(this);
        input.inputType = InputType.TYPE_CLASS_NUMBER
        input.setHint("1")
        builder.setView(input)
        builder.setNeutralButton("poista"){ dialog: DialogInterface?, which: Int ->
            myDbManager.openDb()
            myDbManager.delFromDb(tabName, tNimi)
            myDbManager.closeDb()
            onResume()
        }
        builder.setPositiveButton("Lisää"){ dialog: DialogInterface?, which: Int ->

            var kpl = input.text.toString()
            if (kpl == ""){kpl = "1"}
            myDbManager.openDb()
            myDbManager.insertToDb(tNimi, "mylist", kpl)
            myDbManager.closeDb()

        }
        builder.setNegativeButton("Cancel"){ dialog: DialogInterface?, which: Int ->

        }
        builder.show()
    }


    fun add_to_leiv(view: View?) {
        myDbManager.openDb()
        myDbManager.insertToDb(leiv_mess.text.toString(), "leiv", "0")
        this.leiv_mess.setText("")
        val dataList = myDbManager.readDbData("leiv")
        btnList.removeAllViews()
        var id = 1
        for (item in dataList){
            val tN = item.key.toString()
            val btn =  Button(this)
            btn.id = (id)
            btn.text = tN
            btn.textSize = 20.toFloat()
            btn.setOnClickListener(object: View.OnClickListener {
                override fun onClick(v: View?) {
                    createSimpleDialog(tN,  "leiv")
                }
            })

            btnList.addView(btn)
            id++
        }
    }



    override fun onDestroy() {
        super.onDestroy()
        myDbManager.closeDb()
    }

}