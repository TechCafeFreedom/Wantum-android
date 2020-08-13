package com.techcafe.wantum.model

import java.util.*

data class Memory(
    val id: Int,
    val date: String,
    val activity: String,
    val description: String,
    val place: Place,
    val photos: List<Photo>,
    val tags: List<Tag>,
    val author: User,
    val createdAt: Date
)