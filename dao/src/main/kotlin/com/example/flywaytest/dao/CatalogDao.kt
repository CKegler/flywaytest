package com.example.flywaytest.dao

import com.example.flywaytest.model.CatalogEntry

interface CatalogDao {

    fun get(): CatalogEntry?
}