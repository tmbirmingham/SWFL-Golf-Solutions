package com.zybooks.swflgolfsolutions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tiburon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_SWFLGolfSolutions)
        setContentView(R.layout.activity_tiburon)

        var backbuttontiburon = findViewById<Button>(R.id.backButtonTiburon)
        backbuttontiburon.setOnClickListener {
            val intent = Intent(this, Course_Selection::class.java)
            startActivity(intent)
        }
    }
}