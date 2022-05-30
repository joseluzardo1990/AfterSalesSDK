package com.example.postventalibrary1.network

import com.example.postventalibrary1.domain.model.BreedModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface BreedsService {

    @GET("breeds/list")
    suspend fun getBreeds(): Response<BreedModel>

    @GET("breed/{name}/images")
    suspend fun getBreedImages(@Path("name") name: String): Response<BreedModel>

}