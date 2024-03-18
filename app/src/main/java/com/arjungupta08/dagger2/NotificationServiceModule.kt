package com.arjungupta08.dagger2

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @ActivityScope
    @MessageQualifier
    @Provides
    fun getMessageService(retryCount : Int) : NotificationService {
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService {
        return emailService
    }
}