package com.example.postventalibrary1.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BreedsList(
    breedList: List<String>
){

    LazyColumn{
        items (items = breedList, key = { breed ->
            breed
        }) { breed ->
            Surface(modifier = Modifier.fillMaxWidth().clickable {
                //navController.navigate("$detailsView/$breed")
            }) {
                ItemBreadList(breed)
            }
        }
    }

}