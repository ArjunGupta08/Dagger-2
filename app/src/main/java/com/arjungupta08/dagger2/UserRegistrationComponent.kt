package com.arjungupta08.dagger2

import dagger.Component

@Component
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)
}