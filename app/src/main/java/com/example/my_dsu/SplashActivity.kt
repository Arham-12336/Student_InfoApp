package com.example.testing
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    private val time:Long = 2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_main)
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }, time)
    }
}