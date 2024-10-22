package com.example.myapplication.onboarding

import com.example.myapplication.R

data class OnboardingPage(
    val title: String,
    val description: String,
    val imageRes: Int
)

// Sample data
val onboardingPages = listOf(
    OnboardingPage("Welcome", "Discover new features", R.drawable.welcome),
    OnboardingPage("Stay Connected", "Keep in touch with friends", R.drawable.connected),
    OnboardingPage("Get Started", "Start your journey", R.drawable.get_started)
)
