package com.techcafe.wantum.repository.mapper

import com.techcafe.wantum.api.model.TagResponse
import com.techcafe.wantum.model.Tag

fun TagResponse.toModel() = Tag(
    id = id,
    name = name
)