package com.example.postventalibrary1.domain.usecases

import com.example.postventalibrary1.ui.states.BreedImagesStates
import com.example.postventalibrary1.ui.states.BreedStates

interface GetBreeds {
    suspend fun breedStates(): BreedStates
    suspend fun breedImagesState(name: String): BreedImagesStates
}