package com.techcafe.wantum.repository

import com.google.firebase.auth.FirebaseUser

interface AuthRepository {
    val currentUser: FirebaseUser?
    suspend fun signInWithGoogle(token: String)
}