package com.example.android_cs2

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_cs2.ui.theme.MyYellow

@Composable
//функция вызова текста "Review & Rating"
fun ReviewRating(){
    Row(
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 20.dp)
    )
    {
        Text(
            text = stringResource(R.string.Review),
            fontSize = 29.sp,
            fontWeight = FontWeight.Bold,
            color = MyYellow
        )
        Text(
            text = " & ",
            fontSize = 29.sp,
            fontWeight = FontWeight.Bold,
            color = MyYellow
        )
        Text(
            text = stringResource(R.string.Ratings),
            fontSize = 29.sp,
            fontWeight = FontWeight.Bold,
            color = MyYellow
        )
    }
    }
