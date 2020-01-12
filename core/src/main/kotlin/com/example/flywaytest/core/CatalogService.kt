package com.example.flywaytest.core

import com.example.flywaytest.model.CatalogEntry
import org.springframework.stereotype.Service
import java.util.UUID

@Service
interface CatalogService {

    fun get(id: UUID): CatalogEntry?
}