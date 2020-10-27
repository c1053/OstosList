package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setTitle("OstosLista")
    }
    fun myList(view: View?) {
        val intent = Intent(this@MainActivity, MyList::class.java)
        startActivity(intent)
    }
    fun vihan(view: View?) {
        val intent = Intent(this@MainActivity, vihan::class.java)
        startActivity(intent)
    }
    fun leiv(view: View?) {
        val intent = Intent(this@MainActivity, leiv::class.java)
        startActivity(intent)
    }
    fun hedel(view: View?) {
        val intent = Intent(this@MainActivity, hedel::class.java)
        startActivity(intent)
    }
    fun liha(view: View?) {
        val intent = Intent(this@MainActivity, liha::class.java)
        startActivity(intent)
    }
    fun talous(view: View?) {
        val intent = Intent(this@MainActivity, talous::class.java)
        startActivity(intent)
    }
    fun makeiset(view: View?) {
        val intent = Intent(this@MainActivity, makeiset::class.java)
        startActivity(intent)
    }
    fun lemmiki(view: View?) {
        val intent = Intent(this@MainActivity, lemmiki::class.java)
        startActivity(intent)
    }
    fun maito(view: View?) {
        val intent = Intent(this@MainActivity, maito::class.java)
        startActivity(intent)
    }

}