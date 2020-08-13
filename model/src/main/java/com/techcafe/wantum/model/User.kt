package com.techcafe.wantum.model

// TODO: mailを持つか相談, nicknameも
// TODO: placeのModelを作る
data class User(
    val id: Int,
    val userName: String,
    val name: String,
    val thumbnail: String,
    val bio: String,
    val gender: Gender,
    val place: String,
    val birth: String
)