package com.example.sonsparadormir

import android.media.MediaPlayer
import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sonsparadormir.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SonsParaDormirTheme {
                WhiteNoise()
            }
        }
    }
}



@Composable
fun WhiteNoise() {
    val context = LocalContext.current
    var volume by remember { mutableStateOf(0.5f) } // Volume inicial
    var timerDuration by remember { mutableStateOf(60000L) } // Tempo inicial: 1 minuto
    val mediaPlayer = remember { MediaPlayer() }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = ChampagnePink),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Selecione um som para dormir",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = MountBattenPink,
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(modifier = Modifier.height(20.dp))

        Row(){
            SoundButton("Ventilador", R.drawable.icon_fan, R.raw.fan, mediaPlayer, volume)
            Spacer(modifier = Modifier.height(5.dp))
            SoundButton("Oceano", R.drawable.icon_ocean, R.raw.ocean, mediaPlayer, volume)
        }

        Spacer(modifier = Modifier.height(5.dp))
        SoundButton("Chuva", R.drawable.icon_rain, R.raw.rain, mediaPlayer, volume)

        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier
                .padding(16.dp)

        ) {

            Box(
                modifier = Modifier
                    .background(color = Pink, shape = RoundedCornerShape(16.dp))
                    //.clip(RoundedCornerShape(16.dp))
                    .padding(5.dp)

            ){
                Column(
                    modifier = Modifier
                        .padding(16.dp)


                ) {
                    // Controle de volume
                    Text("Volume: ${(volume * 100).toInt()}%", fontSize = 16.sp)
                    Slider(
                        value = volume,
                        onValueChange = {
                            volume = it
                            mediaPlayer.setVolume(volume, volume)
                        },
                        valueRange = 0f..1f,
                        modifier = Modifier.padding(horizontal = 32.dp),
                        colors = SliderDefaults.colors(
                            thumbColor = UranianBlue,
                            activeTrackColor = LightSkyBlue,
                            inactiveTrackColor = ChampagnePink.copy(alpha = 0.4f)
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Controle de temporizador
                    Text("Definir temporizador (em segundos):", fontSize = 16.sp)
                    Slider(
                        value = timerDuration.toFloat(),
                        onValueChange = { timerDuration = it.toLong() },
                        valueRange = 10000f..300000f,
                        steps = 10,
                        modifier = Modifier.padding(horizontal = 32.dp),
                        colors = SliderDefaults.colors(
                            thumbColor = UranianBlue,
                            activeTrackColor = LightSkyBlue,
                            inactiveTrackColor = ChampagnePink.copy(alpha = 0.4f)
                        )


                    )

                }
            }


        }



        Text("${timerDuration / 1000} segundos", fontSize = 20.sp)

        Spacer(modifier = Modifier.height(16.dp))

        var remainingTime by remember { mutableStateOf(timerDuration / 1000) } // Tempo em segundos

        Button(
            onClick = {
                object : CountDownTimer(timerDuration, 1000) {
                    override fun onTick(millisUntilFinished: Long) {
                        remainingTime = millisUntilFinished / 1000 // Atualiza o tempo restante
                    }

                    override fun onFinish() {
                        remainingTime = 0 // Zera o tempo restante
                        if (mediaPlayer.isPlaying) {
                            mediaPlayer.pause()
                        }
                    }
                }.start()
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = CherryBlossomPink // cor do botão
            )
        ) {
            Text(
                "Iniciar Temporizador",
                fontSize = 25.sp
            )
        }

        // contagem do temporizador
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Tempo restante: $remainingTime segundos",
            fontSize = 20.sp,
            color = MountBattenPink,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

    @Composable
    fun SoundButton(
        label: String,
        iconResId: Int,
        soundResId: Int,
        mediaPlayer: MediaPlayer,
        volume: Float
    ) {
        val context = LocalContext.current
        var estaTocando by remember { mutableStateOf(false) }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable {
                    if (estaTocando) {
                        mediaPlayer.pause()
                    } else {
                        mediaPlayer.reset()
                        mediaPlayer.setDataSource(
                            context,
                            android.net.Uri.parse("android.resource://${context.packageName}/$soundResId")
                        )
                        mediaPlayer.prepare()
                        mediaPlayer.setVolume(volume, volume)
                        mediaPlayer.start()
                    }
                    estaTocando = !estaTocando
                }
                .padding(16.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(color = Platinum)
                //.border(width = 2.dp, color = CherryBlossomPink)
                .padding(15.dp)

        ) {
            Image(
                painter = painterResource(iconResId),
                contentDescription = label,
                modifier = Modifier.size(48.dp)
            )
            Spacer(modifier = Modifier.width(18.dp))
            Text(label, fontSize = 20.sp, style = MaterialTheme.typography.bodyLarge, color = MountBattenPink, fontWeight = FontWeight.Bold )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewWhiteNoiseApp() {
        SonsParaDormirTheme {
            WhiteNoise()
        }
    }

