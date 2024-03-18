package com.arjungupta08.dagger2

import dagger.Module
import dagger.Provides

@Module
class AnalyticsModule {

    @Provides
    fun getAnalytics() : AnalyticsService {
        return MixPanel()
    }
}