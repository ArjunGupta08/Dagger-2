package com.arjungupta08.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()

        val userRegistrationService = component.getUserRegistrationService()
        val emailService = component.getEmailService()

        userRegistrationService.registerUser("email@gmail.com", "123")
    }

}