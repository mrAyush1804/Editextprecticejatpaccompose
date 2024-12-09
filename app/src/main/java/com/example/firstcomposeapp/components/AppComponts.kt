package com.example.firstcomposeapp.components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat.Style
@Composable

fun Normaltextcompont(Values: String) {
    Text(
        text = Values,
        modifier = Modifier
           ,
        style = TextStyle(
            fontSize = 18.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Normal
        ),
        color = Color.Black,
        textAlign = TextAlign.Center
    )
}

@Composable
fun HeadingNormaltextcompont(Values: String) {
    Text(
        text = Values,
        modifier = Modifier,
        style = TextStyle(
            fontSize = 30.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold
        ),
        color = Color.Black,
        textAlign = TextAlign.Center
    )
}
