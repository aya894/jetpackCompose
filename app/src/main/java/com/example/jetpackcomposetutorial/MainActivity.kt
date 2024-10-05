package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTutorialTheme {

                    Greeting()
                }
            }
        }
    }


@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = "Header Image",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp)
                .width(300.dp)
                .height(150.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(R.string.title_jetpack_compose_tutorial),
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Start
        )
        Text(
             text = stringResource(R.string.compose_short_desc),
             modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.compose_long_desc),
             modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Justify
        )
    }



    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTutorialTheme {
        Greeting()
    }
}