package com.arjungupta08.dagger2

class UserRegistrationService(private val userRepository: UserRepository,
                              private val emailService: EmailService) {

    fun registerUser(email : String, password : String) {
        userRepository.saveUser(email, password)
        emailService.send(email, "arjunguptaonline1@gmail.com", "User Registered")
    }
}

/*
*  Unit Testing
*  Single Responsibility
*  Lifetime of these objects
*  Extensible
*/