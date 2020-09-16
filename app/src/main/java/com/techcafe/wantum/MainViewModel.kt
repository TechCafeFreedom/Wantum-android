package com.techcafe.wantum

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.techcafe.wantum.repository.MainRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class MainViewModel(
    private val mainRepository: MainRepository
) : ViewModel() {

    fun getWebClientId(tokenId: String, context: Context) {
        viewModelScope.launch {
            mainRepository.getWebClientId(tokenId, context)
        }
    }
}
