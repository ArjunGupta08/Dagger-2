package com.arjungupta08.dagger2

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {

    @Singleton
    @Provides
    fun getAnalytics() : AnalyticsService {
        return MixPanel()
    }
}