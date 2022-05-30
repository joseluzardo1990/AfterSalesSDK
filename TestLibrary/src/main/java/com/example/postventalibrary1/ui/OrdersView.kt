package com.example.postventalibrary1.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.example.postventalibrary1.ui.BreedsList
import com.example.postventalibrary1.ui.states.BreedStates
import com.example.postventalibrary1.viewmodel.PrincipalListViewModel

@Composable
fun OrdersView(principalListViewModel: PrincipalListViewModel, changeUiComponents: ChangeUiComponents) {

    val breedsState by principalListViewModel.breeds.observeAsState()

    when (breedsState){
        is BreedStates.Error -> {
            changeUiComponents.showLoading(false)
            changeUiComponents.showAlertMsg("")
        }
        is BreedStates.Loading -> {
            changeUiComponents.showLoading(true)
        }
        is BreedStates.BreedsData -> {
            changeUiComponents.showLoading(false)
            BreedsList((breedsState as BreedStates.BreedsData).breedsList)
        }
    }

}