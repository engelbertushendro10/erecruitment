package com.example.erecruitment_app.company.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import com.example.erecruitment_app.BaseActivity
import com.example.erecruitment_app.R
import com.example.erecruitment_app.company.dashboard.CompanyDashboard
import com.example.erecruitment_app.company.register.CompanyRegister
import com.example.erecruitment_app.databinding.ActivityCompanyLoginBinding

class CompanyLogin : BaseActivity<ActivityCompanyLoginBinding>(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        setLayout = R.layout.activity_company_login
        super.onCreate(savedInstanceState)

        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.anda_belum_->{
                intents<CompanyRegister>(this)
            }
            R.id.comp_login ->{
                intents<CompanyDashboard>(this)
            }
        }
    }
}