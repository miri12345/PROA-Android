package com.example.jetpackcomposetutorial

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.Green40
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme
import com.example.jetpackcomposetutorial.ui.theme.Purple40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTutorialTheme {
                Surface {
                    Conversation(messages = SampleData.conversationSample)
                }
            }
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(R.drawable.profile_picture),
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colorScheme.secondary, CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        // Acompanhamos se a mensagem é expandida ou não nesta variável
        var isExpanded by remember { mutableStateOf(false) }

        // surfaceColor será atualizado gradualmente de uma cor para outra
        val surfaceColor by animateColorAsState(
            if (isExpanded) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface,
            label = "",
        )

        // Alternamos a variável isExpanded quando clicamos nesta coluna
        Column(modifier = Modifier.clickable { isExpanded = !isExpanded }) {
            Text(
                text = msg.author,
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.titleSmall
            )

            Spacer(modifier = Modifier.height(4.dp))

            Surface(
                shape = MaterialTheme.shapes.medium,
                shadowElevation = 1.dp,
                // a cor da surfaceColor mudará gradualmente do primário para a superfície
                color = surfaceColor,
                // animateContentSize mudará o tamanho da superfície gradualmente
                modifier = Modifier.animateContentSize().padding(1.dp)
            ) {
                Text(
                    text = msg.body,
                    modifier = Modifier.padding(all = 4.dp),
                    // Se a mensagem for expandida, exibimos todo o seu conteúdo, caso contrário, exibimos apenas a primeira linha
                    maxLines = if (isExpanded) Int.MAX_VALUE else 1,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

// `Criamos um objeto de amostra para simular dados de amostra`
object SampleData {
    val conversationSample = listOf(
        Message("Onofre", "Hoje o dia vai ser incrível!"),
        Message("Bozanka", "Estou aprendendo muito neste universo. E essa mensagem é muito grande para caber em uma única linha."),
        Message("Licurgo", "Cuidado com o Leopardo."),
        Message("Ovalino", "Obrigado por acreditarem em mim."),
        Message("Cafiasparino", "Eu sou a flor silvestre que perfuma os campos! E essa mensagem é muito grande para caber em uma única linha.\"),"),
        Message("Ubelino", "Meu Amor... Aqui Está sua filha."),
        Message("Guilhermina", "Não contavam com a minha astúcia."),
        Message("Fedegunda", "Eu sou o mestre do universo!"),
        Message("Adamastor", "Chaves e Chapolin Colorado."),
        Message("Aretha", "Se você é jovem ainda, jovem ainda, jovem ainda. E essa mensagem é muito grande para caber em uma única linha.\"),"),
        Message("Abeba", "Amanhã é um novo dia."),
        Message("Epaminondas", "Ao infinito e além!"),
    )
}

// Conversa é uma lista de mensagens que vai se expandindo
@Composable
fun Conversation(messages: List<Message>) {
    Column {
        Text(
            text = "Lista de mensagens",
            fontSize = 15.sp,
            fontWeight = Bold,
            textAlign = TextAlign.Center,
            color = Green40,
            


        )
        //LazyColumn gera uma lista de rolagem vertical e LazyRow gera uma lista de rolagem horizontal. Os componentes lentos são diferentes da maioria dos layouts no Compose.
        LazyColumn {
            items(messages) { message ->
                MessageCard(message)
            }
        }
    }

}

@Preview(name = "Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)
@Composable
fun PreviewMessageCard() {
    JetpackComposeTutorialTheme {
        Surface {
            Conversation(messages = SampleData.conversationSample)
        }
    }
}