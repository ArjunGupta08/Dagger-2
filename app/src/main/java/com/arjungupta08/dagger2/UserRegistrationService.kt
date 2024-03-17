package com.arjungupta08.dagger2

import javax.inject.Inject

class UserRegistrationService @Inject constructor (
    private val userRepository: UserRepository,
    private val notificationService: NotificationService
) {
    fun registerUser(email : String, password : String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "arjunguptaonline1@gmail.com", "User Registered")
    }
}

/*
*  Unit Testing
*  Single Responsibility
*  Lifetime of these objects
*  Extensible
*/