package com.example.android_cs2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.android_cs2.ui.theme.elephant
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun videoplayer(){
    
    Box (){
        Image(painter = painterResource(id = R.drawable.promo1), contentDescription = "promo1",
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
            )
        Row(modifier = Modifier
            .fillMaxSize()
            .padding(start = 100.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = R.drawable.plaer),contentDescription = null, Modifier.size(105.dp))

        }




}
}