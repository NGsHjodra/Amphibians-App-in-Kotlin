package kekw.ngs.amphibians.data

import kekw.ngs.amphibians.network.AmphibianApiService
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory

class DefaultAppContainer() : AppContainer {

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(
            Json { ignoreUnknownKeys = true }
                .asConverterFactory(
                    "application/json".toMediaType()
                )
        )
        .baseUrl(BASE_URL)
        .build()


    private val retrofitService: AmphibianApiService by lazy {
        retrofit.create(AmphibianApiService::class.java)
    }

    override val amphibianRepository: AmphibianRepository by lazy {
        NetworkAmphibianRepository(retrofitService)
    }

    companion object {
        private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"
    }
}