package com.example.myclock

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var timeText: TextView
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timeText = findViewById(R.id.timeText)
        val alarmBtn = findViewById<Button>(R.id.alarmBtn)

        alarmBtn.setOnClickListener {
            startActivity(Intent(this, AlarmActivity::class.java))
        }

        startClock()
    }

    private fun startClock() {
        val runnable = object : Runnable {
            override fun run() {
                val sdf = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
                val currentTime = sdf.format(Date())
                timeText.text = currentTime
                handler.postDelayed(this, 1000)
            }
        }
        handler.post(runnable)
    }
}