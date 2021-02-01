package com.example.erecruitment_app

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.erecruitment_app.service.ApiClient
import com.example.erecruitment_app.util.sharedPreferences

open class BaseActivity <ActivityBinding : ViewDataBinding> : AppCompatActivity(){
    protected lateinit var bind: ActivityBinding
    protected lateinit var sharedPref: sharedPreferences
    protected var setLayout: Int? = null

    companion object {
        const val IMAGE_PICK_CODE = 100
        const val PERMISSION_CODE = 101
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = DataBindingUtil.setContentView(this@BaseActivity, setLayout!!)

        sharedPref = sharedPreferences(this@BaseActivity)
    }

    protected inline fun <reified ClassActivity> intents(context: Context) {
        context.startActivity(Intent(context, ClassActivity::class.java))
    }

    protected inline fun <reified ClassActivity> intentsResults(
        context: Context,
        requestCode: Int
    ) {
        startActivityForResult(Intent(context, ClassActivity::class.java), requestCode)
    }

    protected inline fun <reified ApiService> createApi(context: Context): ApiService {
        return ApiClient.getApiClient(context).create(ApiService::class.java)
    }

    protected fun noticeToast(message: String) {
        Toast.makeText(this@BaseActivity, message, Toast.LENGTH_SHORT).show()
    }

    protected fun pickImageFromGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_PICK_CODE)
    }

    protected fun signOutConfirmEngineer() {
        val dialog = AlertDialog
            .Builder(this@BaseActivity)
            .setTitle("Notice!")
            .setMessage("Are you sure to sign out?")
            .setPositiveButton("OK") { _, _ ->
                sharedPref.accountLogoutEngineer()
            }
            .setNegativeButton("Cancel") { dialog, _ ->
                dialog.dismiss()
            }

        dialog?.show()
    }
    protected fun signOutConfirmCompany() {
        val dialog = AlertDialog
            .Builder(this@BaseActivity)
            .setTitle("Notice!")
            .setMessage("Are you sure to sign out?")
            .setPositiveButton("OK") { _, _ ->
                sharedPref.accountLogoutCompany()
            }
            .setNegativeButton("Cancel") { dialog, _ ->
                dialog.dismiss()
            }

        dialog?.show()
    }

}