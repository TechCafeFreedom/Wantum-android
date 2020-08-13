package com.techcafe.wantum.repository.mapper

import com.techcafe.wantum.api.model.UserResponse
import com.techcafe.wantum.model.Gender
import com.techcafe.wantum.model.User
import com.techcafe.wantum.model.UserProfile

fun UserResponse.toModel() = UserProfile(
    user = toUser(),
    memories = toMemories()
)
fun UserResponse.toUser() = User(
    id = id,
    userName = user_name,
    name = name,
    thumbnail = thumbnail,
    bio = bio,
    gender = Gender.of(gender),
    place = place,
    birth = birth
)

fun UserResponse.toMemories() = memories?.map { it.toModel() } ?: listOf()