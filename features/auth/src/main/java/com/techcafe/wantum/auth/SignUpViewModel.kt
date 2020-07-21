package com.techcafe.wantum.auth

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.hadilq.liveevent.LiveEvent
import com.techcafe.wantum.repository.AuthRepository
import kotlinx.coroutines.launch

class SignUpViewModel(
    private val authRepository: AuthRepository
) : ViewModel() {

    val error = LiveEvent<Throwable>()

    fun handleSignInWithGoogleResult(task: Task<GoogleSignInAccount>) {
        try {
            val account: GoogleSignInAccount =
                task.getResult(ApiException::class.java) as GoogleSignInAccount
            val token = account.idToken ?: return
            viewModelScope.launch {
                authRepository.signInWithGoogle(token)
            }
        } catch (e: ApiException) {
            error.value = e
        }
    }
}

