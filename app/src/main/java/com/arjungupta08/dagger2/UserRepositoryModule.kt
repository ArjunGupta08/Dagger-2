package com.arjungupta08.dagger2

import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {
    @Binds
    abstract fun getSqlRepository(sqlRepository : SQLRepository) : UserRepository
}