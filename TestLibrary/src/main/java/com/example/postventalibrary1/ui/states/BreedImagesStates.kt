package com.example.postventalibrary1.ui.states

sealed class BreedImagesStates{
    data class Loading(val msg: String): BreedImagesStates()
    data class BreedsData(val breedImagesList: List<String>): BreedImagesStates()
    data class Error(val error: Throwable): BreedImagesStates()
}
