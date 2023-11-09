package com.example.android_cs2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun znachok(){

    //создание и настройка контейнера
    Card(

        modifier = Modifier
            .padding(start = 10.dp, top = 190.dp)
            .size(80.dp),

        shape = RoundedCornerShape(15.dp)


    )
    //вставка
    {
        Image(
            painter = painterResource(id = R.drawable.znacok),
            contentDescription = null,
            contentScale = ContentScale.Crop,

            )


    }
}