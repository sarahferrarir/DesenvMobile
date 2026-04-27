package com.example.alomundo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etNome = findViewById<EditText>(R.id.etNome)
        var btGerar = findViewById<Button>(R.id.btGerarSaudacao)
        var tvSaudacao = findViewById<TextView>(R.id.tvSaudacao)

        btGerar.setOnClickListener {
            tvSaudacao.text = "Bom dia, " + etNome.text + "!"
        }
    }
}
