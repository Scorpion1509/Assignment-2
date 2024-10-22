package com.example.myapplication.navgraph

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNavigationBar(navController: NavController) {
    val navItems = listOf(
        NavItem("home", Icons.Filled.Home, 0, "home"),
        NavItem("profile", Icons.Filled.AccountCircle, 1, "profile"),
        NavItem("settings", Icons.Filled.Settings, 2, "settings")
    )

    NavigationBar {
        navItems.forEach { item ->
            NavigationBarItem(
                selected = false,
                onClick = {
                    navController.navigate(item.route)  // Navigate to corresponding screen
                },
                icon = {
                    BadgedBox(badge = {
                        if (item.badgeCount > 0) {
                            Badge {
                                Text(text = item.badgeCount.toString())
                            }
                        }
                    }) {
                        Icon(item.icon, contentDescription = item.label)
                    }
                },
                label = { Text(text = item.label) }
            )
        }
    }
}
