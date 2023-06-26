package com.zybooks.swflgolfsolutions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Course_Selection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_SWFLGolfSolutions)
        setContentView(R.layout.activity_course_selection)

        var arrowheadButton = findViewById<Button>(R.id.arrowheadbutton)
        arrowheadButton.setOnClickListener {
            val intent = Intent(this, AHGC::class.java)
            startActivity(intent)
        }

        var valenciaButton = findViewById<Button>(R.id.valenciabutton)
        valenciaButton.setOnClickListener {
            val intent = Intent(this, Valencia::class.java)
            startActivity(intent)
        }

        var tiburonButton = findViewById<Button>(R.id.tiburonbutton)
        tiburonButton.setOnClickListener {
            val intent = Intent(this, Tiburon::class.java)
            startActivity(intent)
        }
    }
}