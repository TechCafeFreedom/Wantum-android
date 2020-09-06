package com.techcafe.wantum

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.techcafe.wantum.repository.MainRepository

class MainViewModelFactory(
    private val repository: MainRepository
): ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}