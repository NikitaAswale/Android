package com.example.android

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontSynthesis.Companion.Weight
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun AndroidUI(){
    Column(){
        Row (){
            Text(text = "New in Android", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        }
        Row (){
            Text(text = "What are you interested in?", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = "Updates from topics you follow will appear here. Follow some things to get started")
        }
        Column {
            Card {
            Row  {
                Text(text = "Headlines", fontSize = 14.sp, fontWeight = FontWeight.Bold)
            }
            }
            Card {
                Row  {
                    Text(text = "UI", fontSize = 14.sp, fontWeight = FontWeight.Bold)
                }
            }
            Card {
                Row  {
                    Text(text  = "Compose", fontSize = 14.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
        Row {
            Button(onClick = {}) {
                Text(text = "Done")
            }
        }
    }
}