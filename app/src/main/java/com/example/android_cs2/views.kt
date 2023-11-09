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
fun views () {
    Text(
    text = stringResource(R.string.ninetyM),
        color = Codein,
    modifier = Modifier.padding(start = 5.dp),
    fontSize = 15.sp
)
}