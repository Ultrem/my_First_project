@file:Suppress("PreviewMustBeTopLevelFunction")

package com.example.tutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tutorial.ui.theme.TutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TutorialWithImage (message1 = "All tasks completed",
                        message2 = "Nice work!",)
                               }
            }
        }
    }
}
@Composable
fun TutorialWithImage(message1: String, message2: String){
    val image = painterResource(id = R.drawable.ic_task_completed)
        Box() {
            Image(
                painter = image, contentDescription = null, modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),

                contentScale = ContentScale.Inside)
            TutorialWithText(message1 = message1, message2 = message2,)
        }
}
@Composable
fun TutorialWithText(message1: String, message2: String,) {
    Column {
        Text(
            text = message1,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 550.dp, bottom = 16.dp, end = 16.dp)
        )
        Text(
            text = message2,
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 20.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun TutorialWithImagePreview() {
    TutorialTheme {
        TutorialWithImage (message1 = "All tasks completed",
            message2 = "Nice work!",)
    }
}