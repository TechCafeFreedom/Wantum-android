package com.techcafe.wantum.model

data class UserProfile(
    val user: User,
    val memories: List<Memory>
)