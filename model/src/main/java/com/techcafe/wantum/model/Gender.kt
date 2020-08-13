package com.techcafe.wantum.model

enum class Gender(private val value: Int) {
    MAN(1),
    WOMAN(2),
    OTHER(3);

    companion object {
        fun of(value: Int) = when (value) {
            1 -> MAN
            2 -> WOMAN
            else -> OTHER
        }
    }

    fun toInt() = this.value
}