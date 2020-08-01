package com.techcafe.wantum.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.techcafe.wantum.repository.AuthRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi

@Suppress("UNCHECKED_CAST")
class SignUpViewModelFactory(
    private val repository: AuthRepository
) : ViewModelProvider.Factory {
    @ExperimentalCoroutinesApi
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        when (modelClass) {
            SignUpViewModel::class.java -> {
                return SignUpViewModel(repository) as T
            }
            else -> {
                throw RuntimeException("Cannot create an instance of $modelClass")
            }
        }
    }
}
