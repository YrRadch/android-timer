package com.example.timerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val time: Long = TimeUnit.MINUTES.toMillis(5)
        val period: Long = 1000


        buttonStart.setOnClickListener {
            timer.run
        }

    }

}

private fun timer() {
}

}
