package com.example.myapplication.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnboardingScreen(navController: NavController) {

    val pagerState = rememberPagerState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // App name and Skip button
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Skillcinema",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Button(onClick = { navController.navigate("home") }) {
                Text("Пропустить")  // Skip button in Russian
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Horizontal Pager for Onboarding Screens
        HorizontalPager(
            count = onboardingPages.size,
            state = pagerState,
            modifier = Modifier
                .weight(0.7f)  // Adjust height for 60-70% of the screen
        ) { page ->
            val currentPage = onboardingPages[page]
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(currentPage.imageRes),
                    contentDescription = null,
                    modifier = Modifier.size(300.dp)  // Adjust as necessary
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = currentPage.title,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(modifier = Modifier.weight(0.1f))

        // Dots Indicator
        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.fillMaxWidth()
        ) {
            repeat(onboardingPages.size) { index ->
                val selected = pagerState.currentPage == index
                val color = if (selected) Color.Blue else Color.Gray
                Box(
                    modifier = Modifier
                        .size(12.dp)  // Increased dot size
                        .padding(4.dp)
                        .background(color, CircleShape)
                )
            }
        }
    }
}
