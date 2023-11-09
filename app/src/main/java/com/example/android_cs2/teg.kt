package com.example.android_cs2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.android_cs2.ui.theme.MyYellow
import com.example.android_cs2.ui.theme.Myblack

@Composable
fun teg(teg:String) {
    Row(
    )
    {

        Card(
            modifier = Modifier.padding(end = 5.dp),
            shape = RoundedCornerShape(size = 12.dp)
        )
        {
            Text(
                text = teg,
                color = Myblack,
                modifier = Modifier
                    .background(color = MyYellow)
                    .padding(2.dp)
            )
        }
    }
}