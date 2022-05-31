package com.example.postventalibrary1.viewmodel

import androidx.lifecycle.ViewModel
import com.example.postventalibrary1.domain.usecases.GetBreeds
import com.example.postventalibrary1.ui.states.BreedImagesStates

class DetailViewModel(
    private val getBreeds: GetBreeds
): ViewModel() {

    suspend fun getBreedImages(name: String): BreedImagesStates {
        return getBreeds.breedImagesState(name)
    }

}