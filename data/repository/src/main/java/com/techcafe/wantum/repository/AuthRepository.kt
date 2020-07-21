package com.techcafe.wantum.repository

interface AuthRepository {
    suspend fun signInWithGoogle(token: String)
}