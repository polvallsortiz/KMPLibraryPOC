package com.straturn.kmplibrarypoc.domain.repository

import com.straturn.kmplibrarypoc.data.datasource.GeoRemoteDatasource
import com.straturn.kmplibrarypoc.data.datasource.GeoRemoteDatasourceImpl
import com.straturn.kmplibrarypoc.domain.GeoEntity

abstract class GeoRepository {
    abstract suspend fun getIpInfo(ip: String): GeoEntity
}

class GeoRepositoryImpl: GeoRepository() {
    private val remoteDatasource: GeoRemoteDatasource = GeoRemoteDatasourceImpl()

    override suspend fun getIpInfo(ip: String): GeoEntity {
        val dto = remoteDatasource.getIpInfo(ip)
        return GeoEntity(dto.ip, dto.city, dto.region, dto.country, dto.loc, dto.org, dto.postal, dto.timezone)
    }
}