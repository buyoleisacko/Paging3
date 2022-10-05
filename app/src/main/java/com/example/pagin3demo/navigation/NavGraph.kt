package com.example.pagin3demo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.pagin3demo.screens.home.HomeScreen

@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(
        navController = navController
        startDestination = Screen.Home.route
    ){
        composable(route = Screen.Home.route){
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Search.route){
            //SearchScreen(navController = navController)
        }
    }
}