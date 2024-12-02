package kekw.ngs.amphibians.data

import kekw.ngs.amphibians.network.Amphibian

interface AmphibianRepository {
    suspend fun getAmphibians(): List<Amphibian>
}