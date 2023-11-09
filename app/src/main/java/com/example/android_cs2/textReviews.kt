package com.example.android_cs2

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_cs2.ui.theme.Codein

@Composable
fun textReviews(){
    Text(text = stringResource(R.string.reviews),
        color = Codein,
        modifier = Modifier.padding(start = 3.dp),
        fontSize = 14.sp)
}