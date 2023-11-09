package com.example.android_cs2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun star (star: Int){
    Image(painter = painterResource(id = star), contentDescription = "star",  modifier = Modifier
        .size(35.dp)
        .padding(end = 3.dp))

}