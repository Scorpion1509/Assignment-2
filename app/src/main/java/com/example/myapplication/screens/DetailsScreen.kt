package com.example.myapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.R

@Composable
fun DetailsScreen(navController: NavController, cinemaId: String, cinemaTitle: String, cinemaImageRes: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        // Back button
        IconButton(onClick = { navController.popBackStack() }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_arrow_back), // Ensure you have this drawable
                contentDescription = "Back",
                modifier = Modifier.size(24.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Cinema Image
        Image(
            painter = painterResource(id = cinemaImageRes),
            contentDescription = "Image of $cinemaTitle",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp) // Adjust height as needed
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Cinema Details
        Text(text = "Cinema ID: $cinemaId")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Cinema Title: $cinemaTitle")
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { /* TODO: Add logic to purchase or play cinema */ }) {
            Text(text = "Watch Now")
        }
    }
}
