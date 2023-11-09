package com.example.android_cs2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Screen() {
    Column( modifier = Modifier
        .verticalScroll(rememberScrollState())) {
// создание контейнера Box для шапки экрана
        androidx.compose.foundation.layout
            .Box(modifier = Modifier.height(270.dp))
            //вызов фото и названия игры
            {

                shapka()
                title()

                //вызов звезд
                Row(
                    modifier = Modifier
                        .padding(start = 95.dp, top = 245.dp),
                    verticalAlignment = Alignment.Bottom
                ) {


                    star(star = R.drawable.aaastar)
                    star(star = R.drawable.aaastar)
                    star(star = R.drawable.aaastar)
                    star(star = R.drawable.aaastar)
                    star(star = R.drawable.halfstarrel)

                    views()
                    //вызов значка (маленькой иконки)
                }

                znachok()

            }
        //вызов тэгов
        Row(modifier = Modifier.padding(top = 10.dp, start = 10.dp)) {


            teg(teg = stringResource(R.string.action))
            teg(teg = stringResource(R.string.multiplayer))
            teg(teg = stringResource(R.string.fight))
        }

        //вызов текста с описанием, фотографий , кнопки и надписи ReviewRating

        description()
        promoPhoto()
        ReviewRating()

        //создание контейнера Row в котором будут храниться: рейтинг, звезды и кол-во просмотров
        Row(
            modifier = Modifier
                .padding(bottom = 15.dp),
            verticalAlignment = Alignment.CenterVertically
        )
                //рейтинг
        {
            ocenka()

        // вызов звезд

            Column {
                Row {


                    star(star = R.drawable.aaastar)
                    star(star = R.drawable.aaastar)
                    star(star = R.drawable.aaastar)
                    star(star = R.drawable.aaastar)
                    star(star = R.drawable.halfstarrel)
                }

                textReviews()
            }
        }
             Column(modifier = Modifier.padding(bottom = 85.dp)) {

               //вызов комментариев
            comments()
        }
    }
    button()
    }

