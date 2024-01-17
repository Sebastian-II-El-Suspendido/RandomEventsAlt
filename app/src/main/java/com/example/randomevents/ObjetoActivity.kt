package com.example.randomevents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ObjetoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_objeto)

        val btnRecoger = findViewById<Button>(R.id.btnRecoger)
        val btnContinuarObjeto = findViewById<Button>(R.id.btnContinuarObj)

        btnRecoger.setOnClickListener {
            returnMainActivity()
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