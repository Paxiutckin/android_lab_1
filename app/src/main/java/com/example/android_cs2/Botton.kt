package com.example.android_cs2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_cs2.ui.theme.MyYellow
import com.example.android_cs2.ui.theme.Myblack

@Composable
//создание формы кнопки
fun button(){
    TextButton(
        onClick ={},
        modifier = Modifier
            .padding(start =30.dp, end = 30.dp, top = 25.dp )
            .height(50.dp)
            .width(380.dp)
            .clip(shape = RoundedCornerShape(size = 12.dp))
            .background(color = MyYellow),



        )
        //добавление надписи "Download"
    {
        Text(
            text = stringResource(R.string.download),
            fontSize = 25.sp,
            color = Myblack
        )
    }
}