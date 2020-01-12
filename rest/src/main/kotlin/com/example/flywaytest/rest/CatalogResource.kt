package com.example.flywaytest.rest

import com.example.flywaytest.core.CatalogService
import java.util.UUID
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.core.Response

@Path("/catalog")
class CatalogResource(private val catalogService: CatalogService) {

    @GET
    @Path("{id}")
    fun get(@PathParam("id") id: UUID): Response {

        val entry = catalogService.get(id)
        return Response.ok().build()
    }

}