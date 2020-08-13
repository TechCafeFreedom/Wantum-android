package com.techcafe.wantum.api.model

data class MemoryResponse(
    val id: Int,
    val date: String,
    val activity: String,
    val description: String,
    val place: PlaceResponse,
    val photos: List<PhotoResponse>,
    val tags: List<TagResponse>,
    val author: UserResponse,
    val created_at: String
)