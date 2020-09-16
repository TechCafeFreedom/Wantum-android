package com.techcafe.wantum.repository

import android.content.Context

interface MainRepository {

    suspend fun getWebClientId(tokenId: String, context: Context)
}
