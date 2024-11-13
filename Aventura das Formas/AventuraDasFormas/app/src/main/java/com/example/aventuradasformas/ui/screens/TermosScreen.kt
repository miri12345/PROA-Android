package com.example.aventuradasformas.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.aventuradasformas.MenuBar
import com.example.aventuradasformas.ui.theme.AventuraDasFormasTheme
import androidx.navigation.compose.rememberNavController

@Composable
fun TermosScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFBC4AB))
    ) {
        MenuBar(navController = navController)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFBC4AB)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Box(
                modifier = Modifier
                    .padding(horizontal = 40.dp)
                    .background(Color(0xFFF8AD9D), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        modifier = Modifier.padding(15.dp),
                        text = "Termos de Uso",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 25.sp
                    )
                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        modifier = Modifier.padding(1.dp),
                        text = "Ao acessar o Aventura das Formas Geométricas, você concorda com os termos de uso.",
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp
                    )
                    Spacer(modifier = Modifier.height(20.dp))

                    Text(text = "1. Você pode usar a Aventura das Formas para aprender sobre formas geométricas.")
                    Spacer(modifier = Modifier.height(20.dp))

                    Text(text = "2. Você não pode copiar ou distribuir o conteúdo da Aventura das Formas.")
                    Spacer(modifier = Modifier.height(20.dp))

                    Text(text = "3. Você não pode usar a Aventura das Formas para fins comerciais.")
                }
            }
        }
    }
}

/*@Preview(showBackground = true)
@Composable
fun PreviewStartScreen() {
    AventuraDasFormasTheme {
      //TermosScreen(navController = rememberNavController())
    }
}*/