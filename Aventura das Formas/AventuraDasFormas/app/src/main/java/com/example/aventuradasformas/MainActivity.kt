package com.example.aventuradasformas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aventuradasformas.ui.screens.HomeScreen
import com.example.aventuradasformas.ui.screens.PaginaCadastro
import com.example.aventuradasformas.ui.screens.PaginaLogin
import com.example.aventuradasformas.ui.screens.TermosScreen
import com.example.aventuradasformas.ui.theme.AventuraDasFormasTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aventuradasformas.ui.screens.Circulo
import com.example.aventuradasformas.ui.screens.PaginaSucessoCadastro
import com.example.aventuradasformas.ui.screens.Quadrado
import com.example.aventuradasformas.ui.screens.Triangulo

import android.content.Context
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import android.media.MediaPlayer
import android.widget.Toast
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.platform.LocalContext
import com.example.aventuradasformas.ui.screens.Cubo
import com.example.aventuradasformas.ui.screens.Cuboide
import com.example.aventuradasformas.ui.screens.Hexagono
import com.example.aventuradasformas.ui.screens.PaginaEsqueciaSenha
import com.example.aventuradasformas.ui.screens.Retangulo
import com.example.aventuradasformas.ui.screens.Trapezio


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AventuraDasFormasTheme {
                AppNavigation()
            }
        }
    }
}

const val appName = "Aventura das Formas Geométricas"

@Composable
fun StartScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFBC4AB)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier
                .padding(15.dp),
            text = "Aventura Geométrica",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
        Text(modifier = Modifier
            .padding(15.dp),
            text = "Bem-vindo ao $appName",
            fontWeight = FontWeight.SemiBold,
            fontSize = 15.sp
            )
        Text(text = "Vamos começar!")

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { navController.navigate("login") },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF8AD9D)),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp),
            modifier = Modifier
                .width(200.dp)
                .height(48.dp)
        ) {
            Text(text = "Login")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = { navController.navigate("cadastro") },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4978E)),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp),
            modifier = Modifier
                .width(200.dp)
                .height(48.dp)
        ) {
            Text(text = "Cadastrar")
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuBar(
    navController: NavController,
    onBack: () -> Unit = { navController.popBackStack() },
) {
    TopAppBar(
        title = { Text(text = "Menu") },
        navigationIcon = {
            IconButton(onClick = onBack) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
            }
        },
        actions = {
            IconButton(onClick = { navController.navigate("home") }) {
                Icon(Icons.Default.Home, contentDescription = "Home")
            }
            IconButton(onClick = { navController.navigate("termos") }) {
                Icon(Icons.Default.Info, contentDescription = "Termos")
            }
            IconButton(onClick = {
                // Clear back stack and navigate to start screen
                navController.navigate("pagina_inicial") {
                    popUpTo(0) // Clears the back stack
                }
            }) {
                Icon(Icons.Default.ExitToApp, contentDescription = "Logout")
            }
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = Color(0xFFF8AD9D),
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White,
            actionIconContentColor = Color.White
        )
    )
}



@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "pagina_inicial") {
        composable("pagina_inicial") { StartScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("termos") { TermosScreen(navController) }
        composable("login") { PaginaLogin(navController) }
        composable("cadastro") { PaginaCadastro(navController) }
        composable("cadastrosucesso") { PaginaSucessoCadastro(navController) }
        composable("circulo") { Circulo(navController) }
        composable("quadrado") { Quadrado(navController) }
        composable("triangulo") { Triangulo(navController) }
        composable("esquecisenha") { PaginaEsqueciaSenha(navController) }
        composable("hexagono") { Hexagono(navController) }
        composable("trapezio") { Trapezio(navController) }
        composable("cubo") { Cubo(navController) }
        composable("cuboide") { Cuboide(navController) }
        composable("retangulo") { Retangulo(navController) }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewStartScreen() {
    AventuraDasFormasTheme {
        //StartScreen(navController = rememberNavController())
        //PaginaLogin()
        //MenuScreen()
        //MenuBar(navController = rememberNavController())
    }
}






