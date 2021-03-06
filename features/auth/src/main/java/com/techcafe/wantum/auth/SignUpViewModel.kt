package com.techcafe.wantum.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.hadilq.liveevent.LiveEvent
import com.techcafe.wantum.repository.AuthRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class SignUpViewModel(
    private val authRepository: AuthRepository
) : ViewModel() {

    val isSignIn = authRepository.isSignIn.asLiveData()
    private val _name = authRepository.currentUser.map { it?.displayName ?: "no name" }
    val name: LiveData<String> = _name.asLiveData()
    val error = LiveEvent<Throwable>()

    fun handleSignInWithGoogleResult(task: Task<GoogleSignInAccount>) {
        val account: GoogleSignInAccount =
            task.getResult(ApiException::class.java) as GoogleSignInAccount
        val token = account.idToken ?: return
        runCatching {
            viewModelScope.launch {
                authRepository.signInWithGoogle(token)
            }
        }.onFailure { error.value = it }
    }

    fun signOut() {
        viewModelScope.launch {
            authRepository.signOut()
        }
    }
}
