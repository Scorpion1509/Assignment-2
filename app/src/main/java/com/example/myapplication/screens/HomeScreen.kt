package com.example.myapplication.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.cinema.CinemaSection
import com.example.myapplication.cinema.actionMoviesUSA
import com.example.myapplication.cinema.popularCinemas
import com.example.myapplication.cinema.premieres

@Composable
fun HomeScreen(navController: NavController, modifier: Modifier = Modifier) {

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scrollState)
            .padding(bottom = 56.dp)
    ) {
        Text(
            text = "Skillcinema",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 10.dp)
                .padding(start = 16.dp)
        )

        CinemaSection(
            title = "Премьеры",
            items = premieres,
            onItemClick = { cinemaItem ->
                navController.navigate("details/${cinemaItem.id}/${cinemaItem.title}/${cinemaItem.imageRes}")
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        CinemaSection(
            title = "Популярное",
            items = popularCinemas,
            onItemClick = { cinemaItem ->
                navController.navigate("details/${cinemaItem.id}/${cinemaItem.title}/${cinemaItem.imageRes}")
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        CinemaSection(
            title = "Боевики США",
            items = actionMoviesUSA,
            onItemClick = { cinemaItem ->
                navController.navigate("details/${cinemaItem.id}/${cinemaItem.title}/${cinemaItem.imageRes}")
            }
        )
    }
}
