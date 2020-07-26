package com.techcafe.wantum

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SettingsRepository @Inject constructor(
    private val dataSource: String
) {

    fun fetchSomething(): String {
        return dataSource
    }
}