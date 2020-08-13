package com.techcafe.wantum.repository

import com.techcafe.wantum.model.UserProfile

interface UserRepository {
    suspend fun getUserProfile(userName: String): UserProfile
}
