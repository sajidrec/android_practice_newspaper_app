package com.project.newspapercollection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Timer
import kotlin.concurrent.timerTask

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        Timer().schedule(timerTask {
            startActivity(Intent(applicationContext, HomePage::class.java))
            finish()
        }, 2500)
    }
}