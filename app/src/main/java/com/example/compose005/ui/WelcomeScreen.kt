package com.example.compose005.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WelcomeScreenUI(
    navController: NavController
) {
    Scaffold(
        floatingActionButton = {
            mostImpAction(
                onClick = {
                    navController.navigate(Screen.MainScreen.route)
                }
            )
        }
    ) { pv ->
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(pv)
        ) {
            TextUI(text = "Welcome Screen")
        }
    }
}

@Composable
fun TextUI(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.displayLarge
    )
}

@Composable
fun mostImpAction(
    onClick: () -> Unit = {}
) {
    FloatingActionButton(onClick = { onClick() }) {
        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = "Home"
        )
    }
}