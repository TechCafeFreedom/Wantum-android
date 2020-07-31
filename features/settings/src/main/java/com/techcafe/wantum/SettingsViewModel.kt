package com.techcafe.wantum

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel

class SettingsViewModel @ViewModelInject constructor(
    private val repository: SettingsRepository
) : ViewModel() {

    fun fetchSomething(): String = repository.fetchSomething()
}
