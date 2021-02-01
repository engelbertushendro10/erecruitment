package com.example.erecruitment_app.service

import android.content.Context
import com.example.erecruitment_app.util.sharedPreferences
import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor(private val context: Context) : Interceptor {
    private lateinit var sharedPref: sharedPreferences

    override fun intercept(chain: Interceptor.Chain): Response = chain.run {
        sharedPref = sharedPreferences(context)

        proceed(
            request().newBuilder()
                .addHeader("Authorization", "Bearer ${sharedPref.getToken()}")
                .build()
        )
    }
}