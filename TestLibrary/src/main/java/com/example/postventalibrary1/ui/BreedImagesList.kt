package com.example.postventalibrary1.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable

@Composable
fun BreedImagesList(breedImagesList: List<String>){

    LazyColumn{
        items (items = breedImagesList, key = { breedImage ->
            breedImage
        }) { breedImage ->
            ItemBreadImagesList(breedImage)
        }
    }

}