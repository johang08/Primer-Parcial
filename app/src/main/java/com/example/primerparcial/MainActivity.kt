package com.example.primerparcial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.primerparcial.ui.theme.PrimerParcialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimerParcialTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    data class UiState(
                        val id: Int = 0
                    )
                }
            }
        }
    }
    // MyApp.kt
    @HiltAndroidApp
    class MyApp : Application()
}
sealed class Event {
    // Ej: object Save : Event()
}
@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    // Lógica pendiente
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Composable
fun ListarScreen() {
    Text("Pantalla Listar")
}

@Composable
fun RegistroScreen() {
    Text("Pantalla Registro")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimerParcialTheme {
        Greeting("Android")
    }
}