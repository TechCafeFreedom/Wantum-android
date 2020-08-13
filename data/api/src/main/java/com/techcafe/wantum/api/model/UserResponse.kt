package com.techcafe.wantum.api.model

data class UserResponse(
    val id: Int,
    val user_name: String,
    val name: String,
    val thumbnail: String,
    val bio: String,
    val gender: Int,
    val place: String,
    val birth: String,
    val memories: List<MemoryResponse>?
)