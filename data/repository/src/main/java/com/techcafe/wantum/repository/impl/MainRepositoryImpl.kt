package com.techcafe.wantum.repository.impl

import android.content.Context
import com.techcafe.wantum.repository.MainRepository

class MainRepositoryImpl : MainRepository {

    override suspend fun getWebClientId(tokenId: String, context: Context) {
        context.getSharedPreferences("my_settings", Context.MODE_PRIVATE).edit().apply {
            putString("stringValue", tokenId)
            commit()
        }
    }
}
