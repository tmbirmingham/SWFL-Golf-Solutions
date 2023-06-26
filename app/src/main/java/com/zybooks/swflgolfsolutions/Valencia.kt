package com.zybooks.swflgolfsolutions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.zybooks.swflgolfsolutions.R.*

class Valencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(style.Theme_SWFLGolfSolutions)
        setContentView(layout.activity_valencia)


        val backbuttonvalencia = findViewById<Button>(id.backButtonValencia)
        backbuttonvalencia.setOnClickListener {
            val intent = Intent(this, Course_Selection::class.java)
            startActivity(intent)
        }
    }
}