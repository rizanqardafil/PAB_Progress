package com.example.latihan11e

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.content.Intent
import android.widget.Toast

class HalamanLinear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_linear)

        val KUNCI = "Kunci Linear"
        val pesan = intent.getStringExtra(KUNCI)
        val idPesanMasuk = findViewById<TextView>(R.id.tvPesanMasuk)
        idPesanMasuk.text = pesan
    }

    fun fMain(view: View){
        val intKeMain = Intent(this, MainActivity::class.java)
        startActivity(intKeMain)
    }
    fun fYa(view: View){
        Toast.makeText(applicationContext, "Ya", Toast.LENGTH_SHORT).show()
    }
    fun fTidak(view: View){
        Toast.makeText(applicationContext, "Tidak", Toast.LENGTH_SHORT).show()
    }
}