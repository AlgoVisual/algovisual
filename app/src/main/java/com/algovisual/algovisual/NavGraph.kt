package com.algovisual.algovisual

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.algovisual.algovisual.view.HomeScreen
import com.algovisual.algovisual.view.Screens

@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.Home.route)
    {
        composable(route = Screens.Home.route){
            HomeScreen()
        }
    }
}