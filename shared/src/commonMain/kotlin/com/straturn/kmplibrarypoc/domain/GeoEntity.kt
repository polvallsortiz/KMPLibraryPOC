package com.straturn.kmplibrarypoc.domain

data class GeoEntity(
    val ip: String,
    val city: String,
    val region: String,
    val country: String,
    val loc: String,
    val org: String,
    val postal: String,
    val timezone: String
)
