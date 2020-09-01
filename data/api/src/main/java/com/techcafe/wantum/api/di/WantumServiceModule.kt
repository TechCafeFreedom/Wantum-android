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
    companion object {
        private const val mockUrl = "https://stoplight.io/p/mocks/13862/149690/"
    }
    @Provides
    fun provideMoshi(): Moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    // TODO: debug variantのみLoggingを出す
    @Provides
    fun provideOkHttp(): OkHttpClient = OkHttpClient.Builder()
        .readTimeout(300, TimeUnit.SECONDS)
        .connectTimeout(300, TimeUnit.SECONDS)
        .addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
        .build()

    // TODO: baseUrlをConstに定義する
    @Provides
    fun provideMockRetrofit(
        moshi: Moshi
    ): Retrofit = Retrofit.Builder()
        .baseUrl(mockUrl)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()

    @Provides
    fun provideWantumService(
        retrofit: Retrofit
    ): WantumService = retrofit.create(WantumService::class.java)
}