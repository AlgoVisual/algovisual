package com.algovisual.algovisual

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController

import com.algovisual.algovisual.ui.theme.AlgoVisualTheme

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
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
                            SmallTopAppBar(
                                title = {Text("AlgoVisual")},
                                colors = TopAppBarDefaults.smallTopAppBarColors(
                                    containerColor = MaterialTheme.colorScheme.primary,
                                    titleContentColor = Color.White,
                                ),
                            )
                        },
                        content = {
                            val navController = rememberNavController()

                            NavGraph(navController = navController)
                        }
                    )
                }
            }
        }
    }
}