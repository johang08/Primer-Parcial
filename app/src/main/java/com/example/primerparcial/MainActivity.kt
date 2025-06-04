package com.example.primerparcial

import android.app.Application
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
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.rememberNavController
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

annotation class HiltAndroidApp

sealed class Event {
    // Ej: object Save : Event()
}

sealed class Screen(val route: String) {
    object Registro : Screen("registro")
    object Listar : Screen("listar")
}

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    // Lógica pendiente
}

annotation class Inject

annotation class HiltViewModel

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
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "registro") {
        composable("registro") { RegistroScreen() }
        composable("listar") { ListarScreen() }
    }
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