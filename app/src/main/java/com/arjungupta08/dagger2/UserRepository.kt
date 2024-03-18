package com.arjungupta08.dagger2

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun saveUser(email:String, password:String)
}

// Constructor injection
@Singleton
class SQLRepository @Inject constructor(private val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email:String, password:String) {
        Log.d(TAG, "User saved in DB")
        analyticsService.trackEvent("Saved in DB", "CREATE")
    }
}

class FirebaseRepository(private val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in Firebase")
        analyticsService.trackEvent("Saved", "CREATE")
    }
}