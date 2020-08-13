package com.techcafe.wantum.repository.impl

import com.techcafe.wantum.api.WantumService
import com.techcafe.wantum.model.UserProfile
import com.techcafe.wantum.repository.UserRepository
import com.techcafe.wantum.repository.mapper.toModel
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val service: WantumService
) : UserRepository {
    // TODO: エラーハンドリング
    override suspend fun getUserProfile(userName: String): UserProfile {
        val response = service.getUser(userName)
        return response.toModel()
    }
}