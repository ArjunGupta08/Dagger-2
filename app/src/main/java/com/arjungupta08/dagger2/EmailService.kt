package com.arjungupta08.dagger2

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService{
    fun send(to : String, from:String, body:String?)
}

@Singleton
class EmailService @Inject constructor() : NotificationService{
    override fun send(to : String, from:String, body:String?) {
        Log.d(TAG, "Email Sent!")
    }
}

class MessageService(private val retryCount : Int) : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d(TAG, "Message Sent! Retry Count - $retryCount")
    }

}