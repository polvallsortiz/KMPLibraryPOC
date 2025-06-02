package com.straturn.kmplibrarypoc.domain.repository

import com.straturn.kmplibrarypoc.data.datasource.GeoRemoteDatasource
import com.straturn.kmplibrarypoc.domain.GeoEntity

class GeoRepository(
    private val remoteDatasource: GeoRemoteDatasource = GeoRemoteDatasource()
) {
    suspend fun getIpInfo(ip: String): GeoEntity {
        val dto = remoteDatasource.getIpInfo(ip)
        return GeoEntity(dto.ip, dto.city, dto.region, dto.country, dto.loc, dto.org, dto.postal, dto.timezone)
    }
}