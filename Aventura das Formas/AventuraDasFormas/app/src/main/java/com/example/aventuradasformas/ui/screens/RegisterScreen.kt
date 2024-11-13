package com.example.aventuradasformas.ui.screens

import androidx.benchmark.perfetto.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
//import com.example.aventuradasformas.MenuScreen
import com.example.aventuradasformas.R
import com.example.aventuradasformas.appName
import com.example.aventuradasformas.ui.theme.AventuraDasFormasTheme


@Composable
fun PaginaLogin(navController: NavController) {
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
            text = "Bem-vindo de volta",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp
        )
        Text(text = "Por favor, faça login para continuar")

        Spacer(modifier = Modifier.height(16.dp))

        // E-mail e Caixa de Texto
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "E-mail")
            OutlinedTextField(
                value = "",
                onValueChange = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .height(40.dp)
                    .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(8.dp))
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Senha e Caixa de Texto
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Senha")
            OutlinedTextField(
                value = "",
                onValueChange = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .height(40.dp)
                    .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(8.dp))
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Botão Login
        Button(
            onClick = { navController.navigate("home") },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4978E)),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp),
            modifier = Modifier
                .width(200.dp)
                .height(48.dp)
        ) {
            Text(text = "Login")
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Botão Esqueci a Senha
        Button(
            onClick = { navController.navigate("esquecisenha") },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF8AD9D)),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp),
            modifier = Modifier
                .width(200.dp)
                .height(48.dp)
        ) {
            Text(text = "Esqueci a senha")
        }
    }
}



@Composable
fun PaginaCadastro(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFFBC4AB)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text( modifier = Modifier
            .padding(15.dp),
            text = "Crie uma conta",
            fontWeight = FontWeight.SemiBold,
            fontSize = 25.sp
            )
        Text(modifier = Modifier
            .padding(15.dp),
            text = "Por favor, preencha os campos abaixo para criar uma conta")

        //nome
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Nome")
            OutlinedTextField(
                value = "",
                onValueChange = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .height(40.dp)
                    .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(8.dp))
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        //email
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Email")
            OutlinedTextField(
                value = "",
                onValueChange = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .height(40.dp)
                    .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(8.dp))
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        //senha
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Senha")
            OutlinedTextField(
                value = "",
                onValueChange = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .height(40.dp)
                    .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(8.dp))
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController.navigate("cadastrosucesso") },
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

@Composable
fun PaginaEsqueciaSenha(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFFBC4AB)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(modifier = Modifier
            .padding(15.dp),
            text = "Esqueci a senha",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp
            )
        Text(modifier = Modifier
            .padding(15.dp),
            text = "Por favor, informe o e-mail cadastrado para recuperar a senha")

        Spacer(modifier = Modifier.height(10.dp))

        //Email
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Email")
            OutlinedTextField(
                value = "",
                onValueChange = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .height(40.dp)
                    .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(8.dp))
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController.navigate("login") },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4978E)),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp),
            modifier = Modifier
                .width(200.dp)
                .height(48.dp)
        ) {
            Text(text = "Recuperar senha")
        }
    }
}

@Composable
fun PaginaSucessoCadastro(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFFBC4AB)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text( modifier = Modifier
            .padding(15.dp),
            text = "Cadastro realizado com sucesso!",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp
            )
        Image(
            painter = painterResource(id = R.drawable.confirmacao),
            contentDescription = "Quadrado",
            modifier = Modifier.size(150.dp)
        )
        Text(text = "Bem-vindo ao $appName")

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {  navController.navigate("login") },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4978E)),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp),
            modifier = Modifier
                .width(200.dp)
                .height(48.dp)) {
            Text(text = "Continuar")
        }
    }
}

/*@Preview(showBackground = true)
@Composable
fun PreviewStartScreen() {
    AventuraDasFormasTheme {
        //PaginaLogin(navController = rememberNavController())
        //PaginaSucessoCadastro(rememberNavController())
        //PaginaCadastro(rememberNavController())
        //PaginaEsqueciaSenha()
    }
}*/