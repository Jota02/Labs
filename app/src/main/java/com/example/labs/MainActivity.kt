package com.example.labs

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.button_inicial)
        buttonClick.setOnClickListener{
            val intent =  Intent(this, MainActivity2::class.java).apply {putExtra("name", "Joao Pedro")}
            startActivity(intent)
            finish()
        }
        val buttonlab2 = findViewById<Button>(R.id.button_lab2)
        buttonlab2.setOnClickListener{
            val lab = Intent(this,lab2::class.java)
            startActivity(lab)
        }

    }
}