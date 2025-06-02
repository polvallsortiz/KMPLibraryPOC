package com.straturn.kmplibrarypoc.domain.usecases

import com.straturn.kmplibrarypoc.domain.GeoEntity
import com.straturn.kmplibrarypoc.domain.repository.GeoRepository
import com.straturn.kmplibrarypoc.domain.repository.GeoRepositoryImpl

abstract class GetIpInfoUseCase {
    abstract suspend operator fun invoke(ip: String): GeoEntity
}

class GetIpInfo: GetIpInfoUseCase() {
    private val repository: GeoRepository = GeoRepositoryImpl()

    override suspend fun invoke(ip: String): GeoEntity {
        return repository.getIpInfo(ip)
    }
}