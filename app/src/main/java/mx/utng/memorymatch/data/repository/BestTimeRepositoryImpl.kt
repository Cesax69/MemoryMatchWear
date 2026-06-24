package mx.utng.memorymatch.data.repository

import mx.utng.memorymatch.data.datasource.BestTimeDataSource
import mx.utng.memorymatch.domain.repository.BestTimeRepository

class BestTimeRepositoryImpl(private val ds: BestTimeDataSource) : BestTimeRepository {
    override suspend fun getBestTime() = ds.getBestTime()
    override suspend fun saveBestTime(s: Long) = ds.saveBestTime(s)
}
