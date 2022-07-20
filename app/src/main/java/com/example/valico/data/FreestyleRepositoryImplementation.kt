package com.example.valico.data

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

//    override suspend fun insertBarrelFreestyle(freestyle: Freestyle) {
//        dao2.insertBarrelFreestyle(freestyle)
//    }
//
//    override suspend fun deleteBarrelFreestyle(barrelFreestyle: BarrelFreestyle) {
//        dao2.deleteBarrelFreestyle(barrelFreestyle)
//    }
//
//    override suspend fun getBarrelFreestyleById(id: Int): BarrelFreestyle? {
//        return dao2.getBarrelFreestyleById(id)
//    }
//
//    override fun getBarrelFreestyles(): List<BarrelFreestyle> {
//        return dao2.getBarrelFreestyles()
//    }

}