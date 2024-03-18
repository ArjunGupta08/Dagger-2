package com.arjungupta08.dagger2

import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send(to : String, from:String, body:String?)
}
class EmailService @Inject constructor() : NotificationService{
    override fun send(to : String, from:String, body:String?) {
        Log.d(TAG, "Email Sent!")
    }
}

class MessageService @Inject constructor(private val retryCount : Int) : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d(TAG, "Message Sent!")
    }

}