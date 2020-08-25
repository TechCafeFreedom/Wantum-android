package com.techcafe.wantum.repository.impl

import android.content.Context
import android.provider.Settings.Global.putString
import com.techcafe.wantum.repository.MainRepository

class MainRepositoryImpl : MainRepository {

    override suspend fun getWebClientId(clientId: String) {
//        getSharedPreferences("my_settings", Context.MODE_PRIVATE).edit().apply {
//            putString("stringValue", clientId)
//            commit()
//        }
    }
}