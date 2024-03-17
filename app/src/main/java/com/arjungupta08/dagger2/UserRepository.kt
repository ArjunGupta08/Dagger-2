package com.arjungupta08.dagger2

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email:String, password:String)
}

// Constructor injection
class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email:String, password:String) {
        Log.d(TAG, "User saved in DB")
    }
}

class FirebaseRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in Firebase")
    }
}