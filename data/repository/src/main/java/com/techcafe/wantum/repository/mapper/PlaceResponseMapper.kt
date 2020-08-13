package com.techcafe.wantum.repository.mapper

import com.techcafe.wantum.api.model.PlaceResponse
import com.techcafe.wantum.model.Place

fun PlaceResponse.toModel() = Place(
    id = id,
    name = name
)