package com.techcafe.wantum.repository

interface AuthRepository {
    // TODO: ArrowのTry導入
    suspend fun signInWithGoogle(token: String)
}