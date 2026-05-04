package com.sfr.intentexplicit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val r1 = intent.getBooleanExtra("R1", false)
        val rg = findViewById<RadioGroup>(R.id.rgPergunta2)
        val btn = findViewById<Button>(R.id.btnProximo2)

        btn.setOnClickListener {
            val selectedId = rg.checkedRadioButtonId
            if (selectedId != -1) {
                val intent = Intent(this, Activity3::class.java)
                intent.putExtra("R1", r1)
                intent.putExtra("R2", selectedId == R.id.rbSim)
                startActivity(intent)
            }
        }
    }
}
