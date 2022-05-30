package com.example.postventalibrary1.ui.states

sealed class BreedStates{
    data class Loading(val msg: String): BreedStates()
    data class BreedsData(val breedsList: List<String>): BreedStates()
    data class Error(val error: Throwable): BreedStates()
}
