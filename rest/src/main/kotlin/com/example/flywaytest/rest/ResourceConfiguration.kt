package com.example.flywaytest.rest

import com.example.flywaytest.core.CatalogService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class ResourceConfiguration @Autowired constructor(
        private val catalogService: CatalogService
) {

    @Bean
    open fun catalogResource() = CatalogResource(catalogService)
}