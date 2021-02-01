package com.example.erecruitment_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast

class OnboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }

    fun engineers(view: View) {
        Toast.makeText(this, "engineer button", Toast.LENGTH_SHORT).show()
    }
    fun Company(view: View) {
        Toast.makeText(this, "Company button", Toast.LENGTH_SHORT).show()
    }
}