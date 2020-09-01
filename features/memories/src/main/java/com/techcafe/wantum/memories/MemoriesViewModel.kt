package com.techcafe.wantum.memories

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.techcafe.wantum.model.UserProfile
import com.techcafe.wantum.repository.UserRepository
import kotlinx.coroutines.launch

class MemoriesViewModel @ViewModelInject constructor(
    private val repository: UserRepository
) : ViewModel() {

    private val _userProfile: MutableLiveData<UserProfile> = MutableLiveData()
    val userProfile: LiveData<UserProfile>
        get() = _userProfile

    fun fetchUserProfile() {
        viewModelScope.launch {
            _userProfile.postValue(repository.getUserProfile("test"))
        }
    }
}