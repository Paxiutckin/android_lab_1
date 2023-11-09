package com.example.android_cs2

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
//функция вызова фото
fun promoPhoto(){

    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .fillMaxWidth()
            .height(180.dp)


        ) {
        videoplayer()
        promo(promo = R.drawable.promo2)
        promo(promo = R.drawable.promo3)
        promo(promo = R.drawable.promo4)
        promo(promo = R.drawable.promo5)


    }
}