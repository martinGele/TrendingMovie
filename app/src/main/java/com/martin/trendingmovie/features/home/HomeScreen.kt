package com.martin.trendingmovie.features.home

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.paging.ExperimentalPagingApi
import androidx.paging.compose.collectAsLazyPagingItems
import coil.annotation.ExperimentalCoilApi
import com.martin.trendingmovie.features.common.BottomNavigation
import com.martin.trendingmovie.features.common.ListContentPaged
import com.martin.trendingmovie.navigation.Screen

@ExperimentalCoilApi
@ExperimentalPagingApi
@Composable
fun HomeScreen(
    navController: NavHostController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val getAllMovies = viewModel.getAllTrendingMovies.collectAsLazyPagingItems()

    Scaffold(
        bottomBar = {
        BottomNavigation(navController = navController)
    }, topBar = {
        HomeTopBar(
            onSearchClicked = {
                navController.navigate(Screen.Search.route)
            }
        )
    }, content = {
        ListContentPaged(pagedItemsLazy = getAllMovies, navController = navController)
    })
}