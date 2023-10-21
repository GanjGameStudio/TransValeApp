package com.tva.transvaleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutBtn: Button = findViewById(R.id.aboutBtn)

        aboutBtn.setOnClickListener(){
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }
    }
}