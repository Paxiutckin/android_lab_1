package com.example.android_cs2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
//функция в которой настраиваются  параметры фото
fun promo(promo:Int){
    Image(painter = painterResource(id = promo),
        contentDescription = "null",
        modifier = Modifier.padding(5.dp).clip(RoundedCornerShape(10.dp)),
        contentScale = ContentScale.Fit,)
}