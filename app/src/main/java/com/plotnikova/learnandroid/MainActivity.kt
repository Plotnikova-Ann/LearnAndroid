package com.plotnikova.learnandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plotnikova.learnandroid.ui.theme.LearnAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    Text(
        text = "Hello world!",
        modifier = Modifier
            .background(color = Color.Red)
            .padding(
                start = 30.dp,
                top = 16.dp,
                end = 25.dp,
                bottom = 32.dp
            )
            .border(
                width = 2.dp,
                color = Color.Blue
            )
            .width(200.dp),
        fontWeight = FontWeight.Bold,
        color = Color.Green,
        fontSize = 20.sp,
        fontStyle = FontStyle.Italic
    )
}