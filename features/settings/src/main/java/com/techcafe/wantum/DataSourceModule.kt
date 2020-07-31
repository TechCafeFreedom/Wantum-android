package com.techcafe.wantum

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
class DataSourceModule {

    @Provides
    fun provideDataSource(): String {
        return "datasource"
    }
}
