package com.example.randomevents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EnemigoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enemigo)
        val btnRecoger = findViewById<Button>(R.id.btnLuchar)
        val btnContinuarObjeto = findViewById<Button>(R.id.btnHuir)

        btnRecoger.setOnClickListener {
            val intent = Intent(this,Tobecontinued::class.java)
            startActivity(intent)
        }

        btnContinuarObjeto.setOnClickListener {
            returnMainActivity()
        }
    }

    private fun returnMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    }
