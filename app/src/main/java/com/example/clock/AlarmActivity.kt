package com.example.clock

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AlarmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)

        val setAlarmBtn = findViewById<Button>(R.id.setAlarmBtn)

        setAlarmBtn.setOnClickListener {
            val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
                putExtra(AlarmClock.EXTRA_HOUR, 7)
                putExtra(AlarmClock.EXTRA_MINUTES, 30)
                putExtra(AlarmClock.EXTRA_MESSAGE, "My Alarm")
            }
            startActivity(intent)
        }
    }
}
