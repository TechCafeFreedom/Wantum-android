package com.techcafe.wantum.repository.mapper

import com.techcafe.wantum.api.model.PhotoResponse
import com.techcafe.wantum.model.Photo

fun PhotoResponse.toModel() = Photo(
    id = id,
    photoUrl = photo_url
)