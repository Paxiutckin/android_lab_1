package com.example.android_cs2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.android_cs2.ui.theme.Myblack

@Composable
//создание фона
fun fon() {
    Box(
        modifier = Modifier
            .background(color = Myblack)
            .fillMaxSize()
    )
}