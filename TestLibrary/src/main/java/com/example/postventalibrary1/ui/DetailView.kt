package com.example.postventalibrary1.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import com.example.postventalibrary1.extras.loading_data
import com.example.postventalibrary1.ui.states.BreedImagesStates
import com.example.postventalibrary1.viewmodel.DetailViewModel

@Composable
fun DetailView(
    name: String,
    detailViewModel: DetailViewModel,
    changeUiComponents: ChangeUiComponents?
){

    val breedImagesState = produceState<BreedImagesStates>(BreedImagesStates.Loading(loading_data)) {
        value = detailViewModel.getBreedImages(name)
    }.value

    when (breedImagesState){
        is BreedImagesStates.Error -> {
            changeUiComponents?.showLoading(false)
            changeUiComponents?.showAlertMsg("")
        }
        is BreedImagesStates.Loading -> {
            changeUiComponents?.showLoading(true)
        }
        is BreedImagesStates.BreedsData -> {
            changeUiComponents?.showLoading(false)
            BreedImagesList(breedImagesState.breedImagesList)
        }
    }

}