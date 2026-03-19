package com.example.myclock

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AlarmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)

        val text = findViewById<TextView>(R.id.alarmText)
        text.text = "Alarm Feature (Basic Version)"
    }
}