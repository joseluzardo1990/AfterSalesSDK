package com.example.postventalibrary1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemBreadList(breed: String){

    Card(elevation = 10.dp, modifier = Modifier
        .padding(top = 5.dp, bottom = 5.dp, start = 10.dp, end = 10.dp)
        .fillMaxWidth()) {
        Row {
            Text(breed, fontSize = 16.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(all = 10.dp))
        }
    }

}