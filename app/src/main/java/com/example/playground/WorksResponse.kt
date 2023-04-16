package com.example.playground

import com.squareup.moshi.Json

data class WorksResponse(
    @Json(name = "links")
    val links: Links,
    @Json(name = "size")
    val size: Int,
    @Json(name = "entries")
    val entries: List<Entry>
) {
    data class Links(
        @Json(name = "self")
        val self: String,
        @Json(name = "work")
        val work: String,
        @Json(name = "next")
        val next: String
    )

    data class Entry(
        @Json(name = "type")
        val type: Type,
        @Json(name = "authors")
        val authors: List<Author>,
        @Json(name = "isbn_13")
        val isbn13: List<String>,
        @Json(name = "languages")
        val languages: List<Language>,
        @Json(name = "pagination")
        val pagination: String,
        @Json(name = "publish_date")
        val publishDate: String,
        @Json(name = "publishers")
        val publishers: List<String>,
        @Json(name = "source_records")
        val sourceRecords: List<String>,
        @Json(name = "subjects")
        val subjects: List<String>,
        @Json(name = "title")
        val title: String,
        @Json(name = "weight")
        val weight: String,
        @Json(name = "full_title")
        val fullTitle: String,
        @Json(name = "works")
        val works: List<Work>,
        @Json(name = "key")
        val key: String,
        @Json(name = "covers")
        val covers: List<Int>,
        @Json(name = "number_of_pages")
        val numberOfPages: Int,
        @Json(name = "latest_revision")
        val latestRevision: Int,
        @Json(name = "revision")
        val revision: Int,
        @Json(name = "created")
        val created: Created,
        @Json(name = "last_modified")
        val lastModified: LastModified,
        @Json(name = "identifiers")
        val identifiers: Identifiers,
        @Json(name = "local_id")
        val localId: List<String>,
        @Json(name = "physical_format")
        val physicalFormat: String,
        @Json(name = "isbn_10")
        val isbn10: List<String>,
        @Json(name = "classifications")
        val classifications: Classifications,
        @Json(name = "ocaid")
        val ocaid: String,
        @Json(name = "notes")
        val notes: Notes,
        @Json(name = "subtitle")
        val subtitle: String,
        @Json(name = "lc_classifications")
        val lcClassifications: List<String>,
        @Json(name = "oclc_numbers")
        val oclcNumbers: List<String>,
        @Json(name = "physical_dimensions")
        val physicalDimensions: String,
        @Json(name = "publish_country")
        val publishCountry: String,
        @Json(name = "work_titles")
        val workTitles: List<String>,
        @Json(name = "contributions")
        val contributions: List<String>,
        @Json(name = "by_statement")
        val byStatement: String,
        @Json(name = "publish_places")
        val publishPlaces: List<String>,
        @Json(name = "other_titles")
        val otherTitles: List<String>,
        @Json(name = "series")
        val series: List<String>,
        @Json(name = "description")
        val description: Description,
        @Json(name = "genres")
        val genres: List<String>,
        @Json(name = "edition_name")
        val editionName: String,
        @Json(name = "first_sentence")
        val firstSentence: FirstSentence,
        @Json(name = "dewey_decimal_class")
        val deweyDecimalClass: List<String>,
        @Json(name = "ia_box_id")
        val iaBoxId: List<String>
    ) {
        data class Type(
            @Json(name = "key")
            val key: String
        )

        data class Author(
            @Json(name = "key")
            val key: String
        )

        data class Language(
            @Json(name = "key")
            val key: String
        )

        data class Work(
            @Json(name = "key")
            val key: String
        )

        data class Created(
            @Json(name = "type")
            val type: String,
            @Json(name = "value")
            val value: String
        )

        data class LastModified(
            @Json(name = "type")
            val type: String,
            @Json(name = "value")
            val value: String
        )

        data class Identifiers(
            @Json(name = "amazon")
            val amazon: List<String>,
            @Json(name = "better_world_books")
            val betterWorldBooks: List<String>,
            @Json(name = "goodreads")
            val goodreads: List<String>,
            @Json(name = "librarything")
            val librarything: List<String>
        )

        class Classifications

        data class Notes(
            @Json(name = "type")
            val type: String,
            @Json(name = "value")
            val value: String
        )

        data class Description(
            @Json(name = "type")
            val type: String,
            @Json(name = "value")
            val value: String
        )

        data class FirstSentence(
            @Json(name = "type")
            val type: String,
            @Json(name = "value")
            val value: String
        )
    }
}