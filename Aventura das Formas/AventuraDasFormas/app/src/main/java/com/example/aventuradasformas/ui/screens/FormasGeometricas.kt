package com.example.aventuradasformas.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.aventuradasformas.R
import com.example.aventuradasformas.ui.theme.AventuraDasFormasTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.navigation.compose.rememberNavController
import com.example.aventuradasformas.MenuBar
import kotlin.math.sqrt

@Composable
fun HomeScreen(navController: NavController) {
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

            Text(
                modifier = Modifier
                    .padding(15.dp),
                text = "Bem-vindo a Seleção de Formas",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Text(
                modifier = Modifier
                    .padding(5.dp),
                text = "Escolha uma forma geométrica:",
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Image(
                    painter = painterResource(id = R.drawable.circuloforma),
                    contentDescription = "Círculo",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 8.dp)
                )
                Button(
                    onClick = { navController.navigate("circulo") },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4978E)),
                    shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .width(200.dp)
                        .height(48.dp)
                ) {
                    Text(text = "Círculo")
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Image(
                    painter = painterResource(id = R.drawable.quadradoforma),
                    contentDescription = "Quadrado",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 8.dp)

                )
                Button(
                    onClick = { navController.navigate("quadrado") },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4978E)),
                    shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .width(200.dp)
                        .height(48.dp)
                ) {
                    Text(text = "Quadrado")
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Image(
                    painter = painterResource(id = R.drawable.retanguloforma),
                    contentDescription = "Retângulo",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 8.dp)

                )
                Button(
                    onClick = { navController.navigate("retangulo") },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4978E)),
                    shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .width(200.dp)
                        .height(48.dp)
                ) {
                    Text(text = "Retângulo")
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Image(
                    painter = painterResource(id = R.drawable.trianguloforma),
                    contentDescription = "Triângulo",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 8.dp)
                )
                Button(
                    onClick = { navController.navigate("triangulo") },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4978E)),
                    shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .width(200.dp)
                        .height(48.dp)
                ) {
                    Text(text = "Triângulo")
                }

            }

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Image(
                    painter = painterResource(id = R.drawable.hexagonoforma),
                    contentDescription = "Hexágono",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 8.dp)
                )
                Button(
                    onClick = { navController.navigate("hexagono") },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4978E)),
                    shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .width(200.dp)
                        .height(48.dp)
                ) {
                    Text(text = "Hexágono")
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Image(
                    painter = painterResource(id = R.drawable.trapezioforma),
                    contentDescription = "Trapézio",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 8.dp)
                )
                Button(
                    onClick = { navController.navigate("trapezio") },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4978E)),
                    shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .width(200.dp)
                        .height(48.dp)
                ) {
                    Text(text = "Trapézio")
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Image(
                    painter = painterResource(id = R.drawable.cuboforma),
                    contentDescription = "Cubo",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 8.dp)
                )
                Button(
                    onClick = { navController.navigate("cubo") },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4978E)),
                    shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .width(200.dp)
                        .height(48.dp)
                ) {
                    Text(text = "Cubo")
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Image(
                    painter = painterResource(id = R.drawable.cuboideforma),
                    contentDescription = "Cubóide",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 8.dp)
                )
                Button(
                    onClick = { navController.navigate("cuboide") },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4978E)),
                    shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .width(200.dp)
                        .height(48.dp)
                ) {
                    Text(text = "Cubóide")
                }
            }

        }
    }
}


@Composable
fun Circulo(navController: NavController) {

    var raio by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }

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

            Text(
                modifier = Modifier.padding(15.dp),
                text = "Calcule a área do círculo",
                fontWeight = FontWeight.SemiBold,
                fontSize = 30.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.circuloforma),
                contentDescription = "Círculo",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color(0xFFF8AD9D), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    // Raio
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Raio",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(10.dp)
                        )
                        OutlinedTextField(
                            value = raio,
                            onValueChange = {
                                raio = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = {
                            area =
                                if (raio.isNotEmpty()) Math.PI * raio.toDouble() * raio.toDouble() else 0.0
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF08080)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .width(200.dp)
                            .height(48.dp)
                    ) {
                        Text(text = "Calcular área", fontSize = 18.sp)
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Área: $area",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun Quadrado(navController: NavController) {
    var altura by remember { mutableStateOf("") }
    var base by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }

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
            Text(
                modifier = Modifier.padding(15.dp),
                text = "Calcule a área do quadrado",
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.quadradoforma),
                contentDescription = "Quadrado",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color(0xFFF8AD9D), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    //altura
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Altura",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(7.dp)
                        )
                        OutlinedTextField(
                            value = altura,
                            onValueChange = {
                                altura = it
                                //area = if (altura.isNotEmpty()) altura.toDouble() * base.toDouble() else 0.0
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //base
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Base",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(10.dp)
                        )
                        OutlinedTextField(
                            value = base,
                            onValueChange = {
                                base = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF08080)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .width(200.dp)
                            .height(48.dp),
                        onClick = {
                            area = if (altura.isNotEmpty() && base.isNotEmpty()) {
                                base.toDouble() * altura.toDouble()
                            } else {
                                0.0
                            }
                        }) {
                        Text(text = "Calcular área")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Área: $area",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )

                }
            }
        }
    }
}

@Composable
fun Triangulo(navController: NavController) {
    var altura by remember { mutableStateOf("") }
    var base by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }

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

            Text(
                modifier = Modifier.padding(15.dp),
                text = "Calcule a área do triângulo",
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.trianguloforma),
                contentDescription = "Triângulo",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))


            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color(0xFFF8AD9D), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    //altura
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Altura",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(7.dp)
                        )
                        OutlinedTextField(
                            value = altura,
                            onValueChange = {
                                altura = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //base
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Base",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(10.dp)
                        )
                        OutlinedTextField(
                            value = base,
                            onValueChange = {
                                base = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF08080)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .width(200.dp)
                            .height(48.dp),
                        onClick = {
                            area = if (altura.isNotEmpty() && base.isNotEmpty()) {
                                base.toDouble() * altura.toDouble() / 2
                            } else {
                                0.0
                            }
                        }) {
                        Text(text = "Calcular área")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Área: $area",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )

                }
            }

        }
    }
}

@Composable
fun Hexagono(navController: NavController) {
    var lado by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }
    val raizDeTres = sqrt(3.0)

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

            Text(
                modifier = Modifier.padding(15.dp),
                text = "Calcule a área do hexágono",
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.hexagonoforma),
                contentDescription = "Hexágono",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))


            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color(0xFFF8AD9D), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {


                    //lado
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Lado",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(10.dp)
                        )
                        OutlinedTextField(
                            value = lado,
                            onValueChange = {
                                lado = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF08080)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .width(200.dp)
                            .height(48.dp),
                        onClick = {
                            area = if (lado.isNotEmpty()) {
                                6 * Math.pow(lado.toDouble(), 2.0) * raizDeTres / 4
                            } else {
                                0.0
                            }
                        }) {
                        Text(text = "Calcular área")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Área: $area",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )

                }
            }

        }
    }
}

@Composable
fun Trapezio(navController: NavController) {
    var baseMaior by remember { mutableStateOf("") }
    var baseMenor by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }

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

            Text(
                modifier = Modifier.padding(15.dp),
                text = "Calcule a área do trapézio",
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.trapezioforma),
                contentDescription = "Trapézio",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))


            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color(0xFFF8AD9D), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {


                    //base maior
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Base Maior",
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(5.dp)
                        )
                        OutlinedTextField(
                            value = baseMaior,
                            onValueChange = {
                                baseMaior = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //base menor
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Base Menor",
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(5.dp)
                        )
                        OutlinedTextField(
                            value = baseMenor,
                            onValueChange = {
                                baseMenor = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //altura
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Altura",
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(10.dp)
                        )
                        OutlinedTextField(
                            value = altura,
                            onValueChange = {
                                altura = it
                            },
                            modifier = Modifier
                                .fillMaxWidth(0.8f)
                                .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF08080)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .width(200.dp)
                            .height(48.dp),
                        onClick = {
                            area = if (baseMaior.isNotEmpty() && baseMenor.isNotEmpty() && altura.isNotEmpty()) {
                                ((baseMaior.toDouble() + baseMenor.toDouble()) * altura.toDouble()) / 2
                            } else {
                                0.0
                            }
                        }) {
                        Text(text = "Calcular área")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Área: $area",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )

                }
            }

        }
    }
}

@Composable
fun Cubo(navController: NavController) {
    var lado by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }

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

            Text(
                modifier = Modifier.padding(15.dp),
                text = "Calcule a área do cubo",
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.cuboforma),
                contentDescription = "Cubo",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))


            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color(0xFFF8AD9D), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {


                    //lado
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Lado",
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(5.dp)
                        )
                        OutlinedTextField(
                            value = lado,
                            onValueChange = {
                                lado = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF08080)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .width(200.dp)
                            .height(48.dp),
                        onClick = {
                            area = if (lado.isNotEmpty()) {
                               6 * Math.pow(lado.toDouble(), 2.0)
                            } else {
                                0.0
                            }
                        }) {
                        Text(text = "Calcular área")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Área: $area",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )

                }
            }

        }
    }
}

@Composable
fun Cuboide(navController: NavController) {
    var comprimento by remember { mutableStateOf("") }
    var largura by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }

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

            Text(
                modifier = Modifier.padding(15.dp),
                text = "Calcule a área do cubóide",
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.cuboideforma),
                contentDescription = "Cubóide",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))


            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color(0xFFF8AD9D), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {


                    //comprimento
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Comprimento",
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(5.dp)
                        )
                        OutlinedTextField(
                            value = comprimento,
                            onValueChange = {
                                comprimento = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //largura
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Largura",
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(5.dp)
                        )
                        OutlinedTextField(
                            value = largura,
                            onValueChange = {
                                largura = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //altura
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Altura",
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(5.dp)
                        )
                        OutlinedTextField(
                            value = altura,
                            onValueChange = {
                                altura = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF08080)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .width(200.dp)
                            .height(48.dp),
                        onClick = {
                            area = if (comprimento.isNotEmpty() && largura.isNotEmpty() && altura.isNotEmpty()) {
                                2 * (comprimento.toDouble() * largura.toDouble() + comprimento.toDouble() * altura.toDouble() + largura.toDouble() * altura.toDouble())
                            } else {
                                0.0
                            }
                        }) {
                        Text(text = "Calcular área")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Área: $area",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )

                }
            }

        }
    }
}

@Composable
fun Retangulo(navController: NavController) {
    var altura by remember { mutableStateOf("") }
    var base by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }

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

            Text(
                modifier = Modifier.padding(15.dp),
                text = "Calcule a área do retângulo",
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.retanguloforma),
                contentDescription = "Retângulo",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color(0xFFF8AD9D), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    //altura
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Altura",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(7.dp)
                        )
                        OutlinedTextField(
                            value = altura,
                            onValueChange = {
                                altura = it
                                //area = if (altura.isNotEmpty()) altura.toDouble() * base.toDouble() else 0.0
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //base
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Base",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(10.dp)
                        )
                        OutlinedTextField(
                            value = base,
                            onValueChange = {
                                base = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFFFDAB9), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF08080)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .width(200.dp)
                            .height(48.dp),
                        onClick = {
                            area = if (altura.isNotEmpty() && base.isNotEmpty()) {
                                base.toDouble() * altura.toDouble()
                            } else {
                                0.0
                            }
                        }) {
                        Text(text = "Calcular área")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Área: $area",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )

                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewStartScreen() {
    AventuraDasFormasTheme {
        HomeScreen(rememberNavController())
        //Circulo(rememberNavController())
        //Quadrado(rememberNavController())
        //Triangulo(rememberNavController())
        //Hexagono(rememberNavController())
        //Trapezio(rememberNavController())
        //Cubo(rememberNavController())
        Cuboide(rememberNavController())
        //Retangulo(rememberNavController())

    }
}
