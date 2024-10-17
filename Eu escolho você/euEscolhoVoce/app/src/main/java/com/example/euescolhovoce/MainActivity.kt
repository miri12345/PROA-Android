package com.example.euescolhovoce

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.Medium
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.euescolhovoce.ui.theme.EuEscolhoVoceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EuEscolhoVoceTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Filme()
                }
            }
        }
    }
}

@Composable
fun Filme(modifier: Modifier = Modifier) {

    // var sorteio = 1
    var  sorteio by  remember {
        mutableIntStateOf(1)
    }
    var filme = when(sorteio){
        1 -> "Ação"
        2 -> "Comédia"
        3 -> "Romance"
        4 -> "Ficção científica"
        5 -> "Animação"
        else -> "Drama"

    }

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
           // .padding(top = 20.dp)
            .background(color = MaterialTheme.colorScheme.onPrimary)

    ) {


        Text(
            text = "Sorteie o filme da vez!",
            fontSize = 30.sp,
            fontWeight = Bold,
            color = Color.Black,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontFamily = MaterialTheme.typography.titleLarge.fontFamily
        )



        Image(
              painter = painterResource(id = R.drawable.filmes),
              contentDescription = "Filmes",
              modifier = Modifier
                  .width(200.dp)
                  .padding(16.dp)
          )



        Text(
            text = filme,
            fontSize = 30.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontFamily = MaterialTheme.typography.titleLarge.fontFamily
        )




        Button(
            onClick = { sorteio = (1..6).random() },
            colors = ButtonDefaults.buttonColors
                (containerColor =  MaterialTheme.colorScheme.tertiary,
                contentColor =  Color.White)
        ) {
            Text("Sortear")
        }


    }
}

fun onClick() {
    // TODO("Not yet implemented")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EuEscolhoVoceTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Filme()
        }
    }
}
