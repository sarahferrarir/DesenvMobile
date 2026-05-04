package com.sfr.intentexplicit

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btnReiniciar = findViewById<Button>(R.id.btnReiniciar)
        val btnGithub = findViewById<Button>(R.id.btnGithub)

        val r1 = intent.getBooleanExtra("R1", false)
        val r2 = intent.getBooleanExtra("R2", false)
        val r3 = intent.getBooleanExtra("R3", false)

        val heroi = when {
            r1 && r2 && r3 -> "Homem-Aranha"
            r1 && r2 && !r3 -> "Pantera Negra"
            r1 && !r2 && r3 -> "Homem de Ferro"
            r1 && !r2 && !r3 -> "Shuri"
            !r1 && r2 && r3 -> "Thor"
            !r1 && r2 && !r3 -> "Doutor Estranho"
            !r1 && !r2 && r3 -> "Viúva Negra"
            else -> "Nick Fury"
        }

        tvResultado.text = heroi

        btnReiniciar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

        btnGithub.setOnClickListener {
            val url = "https://github.com/sarahferrarir/DesenvMobile/tree/main/6.maio04"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}
