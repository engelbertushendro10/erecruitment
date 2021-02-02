package com.example.erecruitment_app.company.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.erecruitment_app.BaseActivity
import com.example.erecruitment_app.R
import com.example.erecruitment_app.databinding.ActivityCompanyRegisterBinding

class CompanyRegister : BaseActivity<ActivityCompanyRegisterBinding>(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        setLayout = R.layout.activity_company_register
        super.onCreate(savedInstanceState)
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}