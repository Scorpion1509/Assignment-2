package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.navgraph.AppNavGraph
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface {
                    MyApp()
                }
            }
        }
    }

    @Composable
    fun MyApp() {
        val navController = rememberNavController()
        AppNavGraph(navController = navController)
    }
}
