package com.arjungupta08.dagger2

import android.util.Log

interface AnalyticsService {
    fun trackEvent(eventName : String, eventType : String)
}

class MixPanel : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, eventType)
    }
}

class FirebaseAnalytics : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, eventName)
    }
}