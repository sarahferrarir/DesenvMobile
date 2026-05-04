package com.sfr.intentexplicit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val r1 = intent.getBooleanExtra("R1", false)
        val r2 = intent.getBooleanExtra("R2", false)
        val rg = findViewById<RadioGroup>(R.id.rgPergunta3)
        val btn = findViewById<Button>(R.id.btnProximo3)

        btn.setOnClickListener {
            val selectedId = rg.checkedRadioButtonId
            if (selectedId != -1) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("R1", r1)
                intent.putExtra("R2", r2)
                intent.putExtra("R3", selectedId == R.id.rbSim)
                startActivity(intent)
            }
        }
    }
}
