package com.straturn.kmplibrarypoc.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class GeoDTO(
    val ip: String,
    val city: String,
    val region: String,
    val country: String,
    val loc: String,
    val org: String,
    val postal: String,
    val timezone: String
)
