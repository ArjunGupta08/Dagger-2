package com.arjungupta08.dagger2

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {
    @Binds
    @Singleton
    abstract fun getSqlRepository(sqlRepository : SQLRepository) : UserRepository
}