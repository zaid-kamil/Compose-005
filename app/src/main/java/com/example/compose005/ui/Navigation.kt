package com.example.compose005.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.WelcomeScreen.route
    ) {
        composable(route= Screen.WelcomeScreen.route){
            WelcomeScreenUI(navController)
        }
        composable(route= Screen.MainScreen.route){
            MainScreenUI(navController)
        }
    }
}

// screen naming
sealed class Screen(val route: String) {
    object WelcomeScreen : Screen(route = "welcome_screen")
    object MainScreen : Screen(route = "main_screen")
}