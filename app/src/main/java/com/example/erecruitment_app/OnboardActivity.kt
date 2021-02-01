package com.example.erecruitment_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import com.example.erecruitment_app.company.login.CompanyLogin
import com.example.erecruitment_app.engineer.login.EngineerLogin

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
        startActivity(Intent(this, EngineerLogin::class.java))
    }
    fun Company(view: View) {
        Toast.makeText(this, "Company button", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, CompanyLogin::class.java))
    }
}