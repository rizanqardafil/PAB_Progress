package com.example.latihan11e

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val KUNCI = "Kunci Linear"
    fun fLinear(view: View){
        val idPesan = findViewById<TextView>(R.id.etPesan)
        val isiPesan = idPesan.text.toString()
        val intKeLinear = Intent(this, HalamanLinear::class.java)
        intKeLinear.apply {
            putExtra(KUNCI, isiPesan)
        }
        startActivity(intKeLinear)
    }

    fun fRelative(view: View){
        val intKeRelative = Intent(this, HalamanRelative::class.java)
        startActivity(intKeRelative)
    }
}