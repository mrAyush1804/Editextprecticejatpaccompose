package com.example.firstcomposeapp.sreccens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstcomposeapp.components.HeadingNormaltextcompont
import com.example.firstcomposeapp.components.Normaltextcompont

@Composable
fun singupscreen() {

    Surface(
          color = Color.White,
        modifier = Modifier.fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    )
    {
        Column(  modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(1.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Normaltextcompont("Hey there")
         HeadingNormaltextcompont("Create new account")



        }

    }



}

@Composable
@Preview
fun previewdeginsreen()
{
    singupscreen()
}