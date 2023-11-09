package com.example.android_cs2

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_cs2.ui.theme.MyYellow

@Composable
//Создание текста, описание игры
fun description(){
    Row(
        modifier = Modifier
            .padding(horizontal = 5.dp, vertical = 15.dp)
    ) {

        Text(
            stringResource(R.string.description),
            fontSize = 17.sp,
            color = MyYellow
        )
    }
}