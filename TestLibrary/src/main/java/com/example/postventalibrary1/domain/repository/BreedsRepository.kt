package com.example.postventalibrary1.domain.repository

import com.example.postventalibrary1.ui.states.BreedImagesStates
import com.example.postventalibrary1.ui.states.BreedStates

interface BreedsRepository {
    suspend fun getBreeds(): BreedStates
    suspend fun getBreedImages(name: String): BreedImagesStates
}