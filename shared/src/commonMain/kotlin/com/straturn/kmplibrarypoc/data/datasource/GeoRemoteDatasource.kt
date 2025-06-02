package com.straturn.kmplibrarypoc.data.datasource

import com.straturn.kmplibrarypoc.data.dto.GeoDTO
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class GeoRemoteDatasource() {
    private val client = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
            })
        }
    }

    suspend fun getIpInfo(ip: String): GeoDTO {
        //161.185.160.93
        val response: HttpResponse = client.get("https://ipinfo.io/${ip}/geo")
        return response.body()
    }
}