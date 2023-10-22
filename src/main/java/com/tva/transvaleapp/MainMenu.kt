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
        val routesBtn: Button = findViewById(R.id.routesBtn)

        aboutBtn.setOnClickListener(){
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }

        routesBtn.setOnClickListener(){
            val intent = Intent(this, Routes::class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed() {
        // Retorna void! bloqueia a ação do botão "voltar" seja ele virtual ou físico
        return;
    }
}