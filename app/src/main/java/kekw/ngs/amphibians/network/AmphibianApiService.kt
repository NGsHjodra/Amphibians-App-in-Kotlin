package kekw.ngs.amphibians.network

import retrofit2.http.GET

interface AmphibianApiService {
    @GET("amphibians")
    suspend fun getAmphibians(): List<Amphibian>
}