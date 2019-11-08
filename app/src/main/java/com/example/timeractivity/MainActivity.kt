package com.example.timeractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // this code here allow us to get to the timer app
        btn_focus.setOnClickListener{
            timerfun()
        }
        // this funtion allow ths user to go to the timer activity
        btn_relax.setOnClickListener{
            timerfun()
        }
        // this code here allow the user to get to timer activity
        btn_sleep.setOnClickListener{
            timerfun()
        }

    }
    // this funtion allow our user to go to the timer activity
    public fun timerfun(){
        var intent = Intent(application , TimerActivity::class.java)
        startActivities(arrayOf(intent))
    }
}
