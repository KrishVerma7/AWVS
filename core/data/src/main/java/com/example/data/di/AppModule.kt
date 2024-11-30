package com.example.data.di

import com.example.data.firebase.FirebaseWrapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
object AppModule {

    @Provides
    fun provideFirebaseWrapper(): FirebaseWrapper {
        return FirebaseWrapper()
    }
}