package com.techcafe.wantum.repository

import com.techcafe.wantum.repository.impl.UserRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindUserRepository(repository: UserRepositoryImpl): UserRepository
}