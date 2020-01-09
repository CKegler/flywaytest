package com.example.flywaytest.rest

import com.example.flywaytest.model.CatalogEntry
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/catalog")
class CatalogResource {

    @GET
    fun get(): CatalogEntry {
        TODO("return a catalog entry from db")
    }

}