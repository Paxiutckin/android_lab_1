package com.example.android_cs2

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

@Composable
fun comments(){
    ListItem(
        name = stringResource(R.string.name1),
        vrema = stringResource(R.string.date1),
        com = stringResource(R.string.com1),
        fotka = R.drawable.s1mpl
    )
    ListItem(
        name = stringResource(R.string.name2),
        vrema = stringResource(R.string.date2),
        com = stringResource(R.string.com2),
        fotka = R.drawable.boom3
    )
    ListItem(
        name = stringResource(R.string.name3),
        vrema = stringResource(R.string.date3),
        com = stringResource(R.string.com3),
        fotka = R.drawable.booster
    )
}