package com.sfr.intentexplicit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rg = findViewById<RadioGroup>(R.id.rgPergunta1)
        val btn = findViewById<Button>(R.id.btnProximo1)

        btn.setOnClickListener {
            val selectedId = rg.checkedRadioButtonId
            if (selectedId != -1) {
                val intent = Intent(this, Activity2::class.java)
                intent.putExtra("R1", selectedId == R.id.rbSim)
                startActivity(intent)
            }
        }
    }
}
