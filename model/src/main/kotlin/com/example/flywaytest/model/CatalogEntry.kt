package com.example.flywaytest.model

import io.swagger.annotations.ApiModelProperty
import org.apache.commons.lang3.builder.CompareToBuilder
import java.time.LocalDateTime
import java.util.*

data class CatalogEntry(
        @ApiModelProperty(
                value = "The catalog id as a guid. It serves as a foreign key to CatalogEntry.id .",
                example = "f06e2cc0-9fc6-44a0-9184-e126247b629c",
                readOnly = true
        )
        val id: UUID,
        val vid: UUID,
        val version: Long,
        val name: String,
        val desription: String?,
        val owner: UUID?,
        val tags: List<String> = emptyList(),

        val createdBy: UUID,
        val createdOn: LocalDateTime,
        val updatedBy: UUID?,
        val updatedOn: LocalDateTime?
) : Comparable<CatalogEntry> {

    override fun compareTo(other: CatalogEntry): Int {
        return CompareToBuilder.reflectionCompare(this, other)
    }
}