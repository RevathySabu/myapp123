package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val second_page_btn = findViewById<Button>(R.id.second_page_btn)
        second_page_btn.setOnClickListener{
            val Intent = Intent(this,MainActivity2::class.java)
            startActivity(Intent)
        }
    }
}