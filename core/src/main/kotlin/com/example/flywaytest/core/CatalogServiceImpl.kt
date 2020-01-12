package com.example.flywaytest.core

import com.example.flywaytest.dao.CatalogDao
import com.example.flywaytest.model.CatalogEntry
import java.util.*


class CatalogServiceImpl(private val dao: CatalogDao) : CatalogService {

    override fun get(id: UUID): CatalogEntry? = dao.get()

}