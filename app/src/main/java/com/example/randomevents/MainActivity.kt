package com.example.randomevents
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDado = findViewById<Button>(R.id.btnDado)
        btnDado.setOnClickListener {
            RandomActivity()
        }
    }

    private fun RandomActivity() {
        val actividadAleatoria = Random.nextInt(4)
        val intent = when (actividadAleatoria) {
            0 -> Intent(this, ObjetoActivity::class.java)
            1 -> Intent(this, CiudadActivity::class.java)
            2 -> Intent(this, MercaderActivity::class.java)
            else -> Intent(this, EnemigoActivity::class.java)
        }
        startActivity(intent)
    }
}
