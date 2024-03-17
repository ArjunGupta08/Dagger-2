package com.arjungupta08.dagger2

import android.util.Log

class UserRepository {
    fun saveUser(email:String, password:String) {
        Log.d(TAG, "User saved in DB")
    }
}