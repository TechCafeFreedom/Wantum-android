package com.techcafe.wantum.repository

import android.content.Context

interface MainRepository {

    suspend fun getWebClientId(aaa: String, context: Context)
}