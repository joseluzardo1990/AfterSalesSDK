package com.example.postventalibrary1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ItemBreadImagesList(breedImage: String){

    AsyncImage(
        model = breedImage,
        contentDescription = "breed_image",
        modifier = Modifier
            .padding(top = 5.dp, bottom = 5.dp, start = 10.dp, end = 10.dp)
            .fillMaxWidth()
    )

}