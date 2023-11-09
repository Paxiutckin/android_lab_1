package com.example.android_cs2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_cs2.ui.theme.MyYellow
import com.example.android_cs2.ui.theme.Myblack
import com.example.android_cs2.ui.theme.elephant

@Composable
//Создание функции, в которой можно вносить данные о имени фамилии, дате оставленного комментария , и сам комментарий.

fun ListItem(name: String, vrema: String, com: String, fotka: Int) {
       //создание контейнера
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background( color = Myblack)
                .padding(top = 1.dp)
        ) {
            Row (modifier = Modifier
                .padding(top = 10.dp)){

                // добавление  параметров фото
                Image(
                    painter = painterResource(id = fotka),
                    contentDescription = "null",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                )
                //добавление текстов
                Column(modifier = Modifier.padding(horizontal = 10.dp)) {
                    Text(text = name, color = MyYellow, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Text(text = vrema, color = MyYellow)
                    Text(
                        text = com,
                        color = elephant,
                        modifier = Modifier.padding(vertical = 3.dp),
                        fontSize = 17.sp
                    )

                }
            }
        }

}