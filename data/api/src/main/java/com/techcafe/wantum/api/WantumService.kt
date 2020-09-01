package com.techcafe.wantum.api

import com.techcafe.wantum.api.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface WantumService {
    /** User **/
    @GET("users/{user_name}")
    suspend fun getUser(@Path("user_name") userName: String): UserResponse
}