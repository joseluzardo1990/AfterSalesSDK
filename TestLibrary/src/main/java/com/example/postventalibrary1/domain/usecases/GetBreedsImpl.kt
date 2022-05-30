package com.example.postventalibrary1.domain.usecases

import com.example.postventalibrary1.domain.repository.BreedsRepository
import com.example.postventalibrary1.ui.states.BreedImagesStates
import com.example.postventalibrary1.ui.states.BreedStates

class GetBreedsImpl(private val breedsRepository: BreedsRepository): GetBreeds {
    override suspend fun breedStates(): BreedStates = breedsRepository.getBreeds()
    override suspend fun breedImagesState(name: String): BreedImagesStates = breedsRepository.getBreedImages(name)
}