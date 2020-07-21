package com.techcafe.wantum.repository

import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    val currentUser: Flow<FirebaseUser?>
    val isSignIn: Flow<Boolean>
    suspend fun signInWithGoogle(token: String)
    suspend fun signOut()
}