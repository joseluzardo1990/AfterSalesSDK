package com.example.postventalibrary1.network

import com.example.postventalibrary1.domain.repository.BreedsRepository
import com.example.postventalibrary1.extras.error_data
import com.example.postventalibrary1.extras.loading_data
import com.example.postventalibrary1.ui.states.BreedImagesStates
import com.example.postventalibrary1.ui.states.BreedStates
import java.io.IOException

class BreedsRepositoryImpl(
    private val breedsService: BreedsService
): BreedsRepository {

    override suspend fun getBreeds(): BreedStates {
        return try {
            BreedStates.Loading(loading_data)
            val response = breedsService.getBreeds()
            val breedsResponse = response.body()
            if (breedsResponse != null && breedsResponse.status == "success")
            BreedStates.BreedsData(breedsResponse.message)
            else BreedStates.Error(IOException(error_data))
        } catch (exception: Exception) {
            BreedStates.Error(exception)
        }
    }

    override suspend fun getBreedImages(name: String): BreedImagesStates {
        return try {
            BreedImagesStates.Loading(loading_data)
            val response = breedsService.getBreedImages(name)
            val breedImagesResponse = response.body()
            if (breedImagesResponse != null && breedImagesResponse.status == "success")
                BreedImagesStates.BreedsData(breedImagesResponse.message)
            else BreedImagesStates.Error(IOException(error_data))
        } catch (exception: Exception) {
            BreedImagesStates.Error(exception)
        }
    }

}