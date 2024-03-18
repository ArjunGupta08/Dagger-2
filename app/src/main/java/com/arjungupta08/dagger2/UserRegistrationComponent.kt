package com.arjungupta08.dagger2

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class, AnalyticsModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount : Int) : UserRegistrationComponent
    }
}