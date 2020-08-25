package com.techcafe.wantum

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.techcafe.wantum.repository.MainRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class MainViewModel(
    private val mainRepository: MainRepository
): ViewModel() {

    fun getWebClientId(aaa:String) {
        viewModelScope.launch {
            mainRepository.getWebClientId(aaa)
        }
    }
}