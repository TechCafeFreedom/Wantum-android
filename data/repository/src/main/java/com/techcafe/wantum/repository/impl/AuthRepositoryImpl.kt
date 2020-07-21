package com.techcafe.wantum.repository.impl

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.techcafe.wantum.repository.AuthRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

@ExperimentalCoroutinesApi
class AuthRepositoryImpl : AuthRepository {
    // TODO: FirebaseAuthをDIする
    private val firebaseAuth = FirebaseAuth.getInstance()
    override val currentUser = callbackFlow {
        // 初期値
        offer(firebaseAuth.currentUser)
        // 認証状況が変更されたとき
        val listener = FirebaseAuth.AuthStateListener { auth -> offer(auth.currentUser) }
        firebaseAuth.addAuthStateListener(listener)
        awaitClose { firebaseAuth.removeAuthStateListener(listener) }
    }

    override val isSignIn: Flow<Boolean> = currentUser.map { it != null }

    override suspend fun signInWithGoogle(token: String) {
        val credential = GoogleAuthProvider.getCredential(token, null)
        firebaseAuth.signInWithCredential(credential)
    }

    override suspend fun signOut() {
        firebaseAuth.signOut()
    }
}
