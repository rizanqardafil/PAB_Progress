package com.example.latihan11e

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.content.Intent

class HalamanRelative : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_relative)
    }

    fun fMain(view: View){
        val intKeMain = Intent(this, MainActivity::class.java)
        startActivity(intKeMain)
    }
}