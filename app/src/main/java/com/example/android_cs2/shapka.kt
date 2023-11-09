package com.example.android_cs2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
//функция вызова
fun shapka(){
    Image(
        painter = painterResource(id = R.drawable.shapka),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .height(215.dp)
    )
}