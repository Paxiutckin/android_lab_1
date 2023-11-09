package com.example.android_cs2

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_cs2.ui.theme.elephant

@Composable
// функция вызова оценки
fun ocenka(){
    Text(text = stringResource(R.string.ocenka),
        fontSize = 50.sp,
        fontWeight = FontWeight.Bold,
        color = elephant,
        modifier = Modifier
            .padding(horizontal = 10.dp))
}