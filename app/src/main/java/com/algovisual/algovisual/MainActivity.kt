package com.algovisual.algovisual

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.algovisual.algovisual.ui.theme.AlgoVisualTheme
import com.algovisual.algovisual.view.HomeScreen


@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlgoVisualTheme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = {Text("AlgoVisual")},
                                colors = TopAppBarDefaults.smallTopAppBarColors(
                                    containerColor = MaterialTheme.colorScheme.primary,
                                    titleContentColor = Color.White,
                                )
                            )
                        },
                        content = {
                            PageContent(it)
                        },
                    )
                }
            }
        }
    }
}

@Composable
fun PageContent(paddingValues: PaddingValues) {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "home", modifier = Modifier.padding(paddingValues)) {
        composable("home") {
            HomeScreen()
        }
    }

}