package com.arjungupta08.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // Field Injection
    @Inject
    lateinit var userRegistrationService : UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as UserApplication).appComponent

        val userRegistrationComponent = appComponent.getUserRegistrationComponentBuilder().retryCount(3).build()
        userRegistrationComponent.inject(this)

        userRegistrationService.registerUser("email@gmail.com", "123")
    }

}