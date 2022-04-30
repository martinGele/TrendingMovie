package com.martin.trendingmovie.navigation

import com.martin.trendingmovie.R


sealed class Screen(val route: String, val icon: Int? = null, val title:String?= null) {
    object Home : Screen("home_screen", R.drawable.ic_baseline_home,"Home")
    object Search : Screen("search_screen")
    object Detail : Screen("detail_screen")
    object Favorite : Screen("favorite_screen", R.drawable.ic_baseline_favorite, "Favorite")
}
