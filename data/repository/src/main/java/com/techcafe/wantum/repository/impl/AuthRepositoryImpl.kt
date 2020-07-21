package com.techcafe.wantum.repository.impl

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.techcafe.wantum.repository.AuthRepository

class AuthRepositoryImpl : AuthRepository {
    // TODO: FirebaseAuthをDIする
    private val firebaseAuth = FirebaseAuth.getInstance()
    override val currentUser = firebaseAuth.currentUser

    override suspend fun signInWithGoogle(token: String) {
        val credential = GoogleAuthProvider.getCredential(token, null)
        firebaseAuth.signInWithCredential(credential)
    }
}
