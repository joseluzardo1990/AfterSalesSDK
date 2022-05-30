package com.example.postventalibrary1.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.postventalibrary1.domain.usecases.GetBreeds
import com.example.postventalibrary1.ui.states.BreedStates
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PrincipalListViewModel(
    private val getBreeds: GetBreeds
): ViewModel() {

    init {
        getBreeds()
    }

    val breeds = MutableLiveData<BreedStates>()

    private fun getBreeds() = viewModelScope.launch {
        val breedsState = getBreeds.breedStates()
        setBreedsResult(breedsState)
    }

    private suspend fun setBreedsResult(breedStates: BreedStates) = withContext(Dispatchers.IO) {
        breeds.postValue(breedStates)
    }

}