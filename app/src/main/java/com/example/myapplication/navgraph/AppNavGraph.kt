package com.example.myapplication.navgraph

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.screens.DetailsScreen
import com.example.myapplication.screens.HomeScreen
import com.example.myapplication.onboarding.OnboardingScreen
import com.example.myapplication.screens.ProfileScreen
import com.example.myapplication.screens.SettingsScreen

@Composable
fun AppNavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = "onboarding",
        modifier = modifier
    ) {
        composable("onboarding") {
            OnboardingScreen(navController)
        }
        composable("home") {
            MainScreen(navController, showBottomBar = true) { innerPadding ->
                HomeScreen(navController, modifier = innerPadding)
            }
        }
        composable("profile") {
            MainScreen(navController, showBottomBar = true) { innerPadding ->
                ProfileScreen(modifier = innerPadding)
            }
        }
        composable("settings") {
            MainScreen(navController, showBottomBar = true) { innerPadding ->
                SettingsScreen(modifier = innerPadding)
            }
        }
        composable("details/{cinemaId}/{cinemaTitle}/{cinemaImageRes}") { backStackEntry ->
            val cinemaId = backStackEntry.arguments?.getString("cinemaId") ?: ""
            val cinemaTitle = backStackEntry.arguments?.getString("cinemaTitle") ?: ""
            val cinemaImageRes = backStackEntry.arguments?.getString("cinemaImageRes")?.toIntOrNull() ?: 0 // Convert to Int
            DetailsScreen(navController, cinemaId, cinemaTitle, cinemaImageRes)
        }
    }
}
