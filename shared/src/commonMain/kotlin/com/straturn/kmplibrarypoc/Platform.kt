package com.straturn.kmplibrarypoc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform