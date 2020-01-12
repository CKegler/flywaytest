package com.example.flywaytest.dao.jdbi

import com.example.flywaytest.dao.CatalogDao
import com.example.flywaytest.model.CatalogEntry

class JDBICatalogDao : CatalogDao {
    override fun get(): CatalogEntry? {
        TODO("not implemented")
    }

}