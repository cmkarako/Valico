package com.example.valico.data

import kotlinx.coroutines.flow.Flow

class FreestyleRepositoryImplementation(private val dao: FreestyleDao)
    : FreestyleRepository {

    override suspend fun insertFreestyle(freestyle: Freestyle) {
        dao.insertFreestyle(freestyle)
    }

    override suspend fun deleteFreestyle(freestyle: Freestyle) {
        dao.deleteFreestyle(freestyle)
    }

    override suspend fun getFreestyleById(id: Int): Freestyle? {
        return dao.getFreestyleById(id)
    }

    override fun getFreestyles(): List<Freestyle> {
        return dao.getFreestyles()
    }

}