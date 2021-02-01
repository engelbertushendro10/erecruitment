package com.example.erecruitment_app.util

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import com.example.erecruitment_app.company.dashboard.CompanyDashboard
import com.example.erecruitment_app.engineer.dashboard.EngineerDashboard
import com.example.erecruitment_app.guest.LoginActivity

class sharedPreferences(private val context: Context) {
    companion object {
        const val PREF_NAME = "LOGIN"
        const val LOGIN = "IS_LOGIN"
        const val TOKEN = "TOKEN"
        const val AC_ID = "AC_ID"
        const val AC_NAME = "AC_NAME"
        const val AC_EMAIL = "AC_EMAIL"
        const val AC_PHONE = "AC_PHONE"
        const val AC_LEVEL = "AC_LEVEL"
        const val CS_ID = "CS_ID"
        const val CS_GENDER = "CS_GENDER"
        const val CS_DOB = "CS_DOB"
        const val CS_ADDRESS = "CS_ADDRESS"
        const val CS_LATITUDE = "CS_LATITUDE"
        const val CS_LONGITUDE = "CS_LONGITUDE"
        const val CS_PIC_IMAGE = "CS_PIC_IMAGE"
        const val CART_ID = "CART_ID"
    }

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

    private val editor: SharedPreferences.Editor = sharedPreferences.edit()

    fun createAccount(
        csId: Int,
        token: String,
        acId: Int,
        acName: String,
        acEmail: String,
        acPhone: String,
        acLevel: Int,
        csGender: String? = null,
        csDob: String? = null,
        csAddress: String? = null,
        csPicImage: String? = null
    ) {
        editor.putBoolean(LOGIN, true)
        editor.putString(TOKEN, token)
        editor.putInt(AC_ID, acId)
        editor.putString(AC_NAME, acName)
        editor.putString(AC_EMAIL, acEmail)
        editor.putString(AC_PHONE, acPhone)
        editor.putInt(AC_LEVEL, acLevel)
        editor.putInt(CS_ID, csId)
        editor.putString(CS_GENDER, csGender)
        editor.putString(CS_DOB, csDob)
        editor.putString(CS_ADDRESS, csAddress)
        editor.putString(CS_PIC_IMAGE, csPicImage)
        editor.commit()
    }

    fun createAcName(acName: String) {
        editor.putString(AC_NAME, acName)
        editor.commit()
    }

    fun createAcEmail(acEmail: String) {
        editor.putString(AC_EMAIL, acEmail)
        editor.commit()
    }

    fun createAcPhone(acPhone: String) {
        editor.putString(AC_PHONE, acPhone)
        editor.commit()
    }

    fun createAddress(csAddress: String) {
        editor.putString(CS_ADDRESS, csAddress)
        editor.commit()
    }

    fun createCsGender(acGender: String) {
        editor.putString(CS_GENDER, acGender)
        editor.commit()
    }

    fun createCsDateOfBirth(csDob: String) {
        editor.putString(CS_DOB, csDob)
        editor.commit()
    }

    fun createCsPicImage(csPicImage: String) {
        editor.putString(CS_PIC_IMAGE, csPicImage)
        editor.commit()
    }

    fun createCartId(cartId: Int) {
        editor.putInt(CART_ID, cartId)
        editor.commit()
    }

    fun createEmail(acId: Int){
        editor.putString(AC_ID, acId.toString())
        editor.commit()
    }
    fun getIdEmail():Int{
        return sharedPreferences.getInt(AC_ID, 0)
    }

    fun getToken(): String {
        return sharedPreferences.getString(TOKEN, "")!!
    }

    fun getAcId(): Int {
        return sharedPreferences.getInt(AC_ID, 0)
    }

    fun getCartId(): Int {
        return sharedPreferences.getInt(CART_ID, 0)
    }

    fun getAcName(): String {
        return sharedPreferences.getString(AC_NAME, "")!!
    }

    fun getAcEmail(): String {
        return sharedPreferences.getString(AC_EMAIL, "")!!
    }

    fun getAcPhone(): String {
        return sharedPreferences.getString(AC_PHONE, "")!!
    }

    fun getAcLevel(): Int {
        return sharedPreferences.getInt(AC_LEVEL, 0)
    }

    fun getCsId(): Int {
        return sharedPreferences.getInt(CS_ID, 0)
    }

    fun getCsAddress(): String? {
        return sharedPreferences.getString(CS_ADDRESS, null)
    }

    fun getCsGender(): String? {
        return sharedPreferences.getString(CS_GENDER, null)
    }

    fun getCsDateOfBirth(): String? {
        return sharedPreferences.getString(CS_DOB, null)
    }

    fun getCsPicImage(): String? {
        return sharedPreferences.getString(CS_PIC_IMAGE, null)
    }

    fun getIsLogin(): Boolean {
        return sharedPreferences.getBoolean(LOGIN, false)
    }

    fun checkIsLoginEngineer() {
        if (!getIsLogin()) {
            context.startActivity(Intent(context, LoginActivity::class.java))
            (context as EngineerDashboard).finish()
        }
    }
    fun checkIsLoginCompany() {
        if (!getIsLogin()) {
            context.startActivity(Intent(context, LoginActivity::class.java))
            (context as CompanyDashboard).finish()
        }
    }

    fun accountLogoutEngineer() {
        editor.clear()
        editor.commit()

        context.startActivity(Intent(context, LoginActivity::class.java))
        (context as EngineerDashboard).finish()
    }
    fun accountLogoutCompany() {
        editor.clear()
        editor.commit()

        context.startActivity(Intent(context, LoginActivity::class.java))
        (context as CompanyDashboard).finish()
    }

    fun getAccountUser(): HashMap<String, String> {
        val user: HashMap<String, String> = HashMap()
        user[AC_NAME] = sharedPreferences.getString(AC_NAME, "Not set")!!
        user[AC_EMAIL] = sharedPreferences.getString(AC_EMAIL, "Not set")!!
        user[TOKEN] = sharedPreferences.getString(TOKEN, "Not set")!!

        return user
    }
}