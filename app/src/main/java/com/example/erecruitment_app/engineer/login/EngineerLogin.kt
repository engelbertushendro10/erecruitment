package com.example.erecruitment_app.engineer.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import com.example.erecruitment_app.BaseActivity
import com.example.erecruitment_app.R
import com.example.erecruitment_app.company.dashboard.CompanyDashboard
import com.example.erecruitment_app.databinding.ActivityEngineerLoginBinding
import com.example.erecruitment_app.engineer.dashboard.EngineerDashboard
import com.example.erecruitment_app.engineer.register.EngineerRegister

class EngineerLogin : BaseActivity<ActivityEngineerLoginBinding>(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        setLayout = R.layout.activity_engineer_login
        super.onCreate(savedInstanceState)

        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.lupa_kata_s ->{
                intents<EngineerLogin>(this)
            }
            R.id.eng_login ->{
                intents<EngineerDashboard>(this)
            }
            R.id.eng_regis->{
                intents<EngineerRegister>(this)
            }
        }
    }
}