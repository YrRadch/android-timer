package com.example.timerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val timer = Timer (300000/ 1000)
        start.setOnClickListener {timer.start ()}
        stop.setOnClickListener {timer.stop ()}

    }

    class Timer(millisInFuture: Long, countDownInterval: Long) : Timer(millisInFuture, countDownInterval)

}
