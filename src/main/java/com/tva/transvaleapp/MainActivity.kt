package com.tva.transvaleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button


class MainActivity : AppCompatActivity() {
    private var timer: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timerF(2000)

    }

    private fun timerF(value: Long){
        val timeInSeconds: Long = value
        timer = object : CountDownTimer(timeInSeconds, 1000){
            override fun onTick(millisUntilFinished: Long) {
                val secondsRemaining = millisUntilFinished / 1000
            }
            override fun onFinish() {
                runOnUiThread{
                    val intent = Intent(this@MainActivity, MainMenu::class.java)
                    startActivity(intent)
                }
            }
        }
        timer?.start()
    }
    override fun onDestroy() {
        super.onDestroy()
        timer?.cancel()
    }
}