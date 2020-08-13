package com.techcafe.wantum.api.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.techcafe.wantum.api.WantumService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

@Module
@InstallIn(ApplicationComponent::class)
class WantumServiceModule {

    @Provides
    fun provideMoshi() = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    // TODO: debug variantのみLoggingを出す
    @Provides
    fun provideOkHttp() = OkHttpClient.Builder()
        .readTimeout(300, TimeUnit.SECONDS)
        .connectTimeout(300, TimeUnit.SECONDS)
        .addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
        .build()

    // TODO: baseUrlをConstに定義する
    @Provides
    fun provideRetrofit(
        moshi: Moshi
    ) = Retrofit.Builder()
        .baseUrl("")
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()

    @Provides
    fun provideWantumService(
        retrofit: Retrofit
    ) = retrofit.create(WantumService::class.java)
}