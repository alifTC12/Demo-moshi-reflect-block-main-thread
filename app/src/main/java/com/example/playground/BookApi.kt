package com.example.playground

import io.reactivex.Single
import retrofit2.http.GET

interface BookApi {
    @GET("works/OL45804W/editions.json")
    fun getWorks(): Single<WorksResponse>
}