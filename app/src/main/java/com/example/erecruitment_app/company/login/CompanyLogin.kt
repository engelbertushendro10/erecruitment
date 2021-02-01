package com.example.erecruitment_app.company.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.erecruitment_app.BaseActivity
import com.example.erecruitment_app.R
import com.example.erecruitment_app.databinding.ActivityCompanyLoginBinding

class CompanyLogin : BaseActivity<ActivityCompanyLoginBinding>(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        setLayout = R.layout.activity_company_login
        super.onCreate(savedInstanceState)
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}