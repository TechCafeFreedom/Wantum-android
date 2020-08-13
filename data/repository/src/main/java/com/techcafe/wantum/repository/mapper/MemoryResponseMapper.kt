package com.techcafe.wantum.repository.mapper

import com.techcafe.wantum.api.model.MemoryResponse
import com.techcafe.wantum.model.Memory
import java.util.*

fun MemoryResponse.toModel() = Memory(
    id = id,
    date =  date,
    activity = activity,
    description = description,
    place = place.toModel(),
    photos = photos.map { it.toModel() },
    tags = tags.map { it.toModel() },
    author = author.toUser(),
    createdAt = Date() // TODO: DateFormat
)