package com.arjungupta08.dagger2

import android.util.Log

class EmailService {
    fun send(to : String, from:String, body:String?) {
        Log.d(TAG, "Email Sent")
    }
}