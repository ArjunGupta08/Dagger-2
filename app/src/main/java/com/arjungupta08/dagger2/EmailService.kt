package com.arjungupta08.dagger2

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){
    fun send(to : String, from:String, body:String?) {
        Log.d(TAG, "Email Sent")
    }
}