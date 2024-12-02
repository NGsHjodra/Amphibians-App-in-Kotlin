package kekw.ngs.amphibians.data

import kekw.ngs.amphibians.network.Amphibian
import kekw.ngs.amphibians.network.AmphibianApiService

class NetworkAmphibianRepository(
    private val amphibianApiService: AmphibianApiService
) : AmphibianRepository {
    override suspend fun getAmphibians(): List<Amphibian> =
        amphibianApiService.getAmphibians()
}