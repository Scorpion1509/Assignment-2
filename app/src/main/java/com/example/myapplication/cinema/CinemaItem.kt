package com.example.myapplication.cinema

import com.example.myapplication.R

data class CinemaItem(
    val id: Int,
    val title: String,
    val imageRes: Int
)

val premieres = listOf(
    CinemaItem(1, "Premiere 1", R.drawable.premiere),
    CinemaItem(2, "Premiere 2", R.drawable.premiere),
    CinemaItem(3, "Premiere 3", R.drawable.premiere),
    CinemaItem(4, "Premiere 4", R.drawable.premiere),
    CinemaItem(5, "Premiere 5", R.drawable.premiere)
)

val popularCinemas = listOf(
    CinemaItem(6, "Popular 1", R.drawable.popular),
    CinemaItem(7, "Popular 2", R.drawable.popular),
    CinemaItem(8, "Popular 3", R.drawable.popular),
    CinemaItem(9, "Popular 4", R.drawable.popular),
    CinemaItem(10, "Popular 5", R.drawable.popular)
)

val actionMoviesUSA = listOf(
    CinemaItem(11, "Action 1", R.drawable.action_movies),
    CinemaItem(12, "Action 2", R.drawable.action_movies),
    CinemaItem(13, "Action 3", R.drawable.action_movies),
    CinemaItem(14, "Action 4", R.drawable.action_movies),
    CinemaItem(15, "Action 5", R.drawable.action_movies)
)
