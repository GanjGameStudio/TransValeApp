package com.tva.transvaleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        val aboutBtn: Button = findViewById(R.id.aboutBtn)

        aboutBtn.setOnClickListener(){
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }
    }
}