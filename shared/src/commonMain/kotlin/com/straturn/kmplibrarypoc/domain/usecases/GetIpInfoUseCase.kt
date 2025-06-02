package com.straturn.kmplibrarypoc.domain.usecases

import com.straturn.kmplibrarypoc.domain.GeoEntity
import com.straturn.kmplibrarypoc.domain.repository.GeoRepository

class GetIpInfoUseCase(
    private val repository: GeoRepository = GeoRepository()

) {
    suspend fun execute(ip: String): GeoEntity {
        return repository.getIpInfo(ip)
    }
}