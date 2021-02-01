package com.example.erecruitment_app.engineer.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.erecruitment_app.BaseActivity
import com.example.erecruitment_app.R
import com.example.erecruitment_app.databinding.ActivityEngineerLoginBinding

class EngineerLogin : BaseActivity<ActivityEngineerLoginBinding>(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        setLayout = R.layout.activity_engineer_login
        super.onCreate(savedInstanceState)
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}