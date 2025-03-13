package com.example.canchaya.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.canchaya.screens.SportsScreen
import com.example.canchaya.screens.data.SportEnum

@Composable
fun NavHostComposable(
    innerPadding: PaddingValues,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "sports",
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(16.dp)
    ) {
        composable(route = "sports") {
            SportsScreen(
                onSportSelected = { sport ->
                    navController.navigate("detail/${sport.name}")
                }
            )
        }

        composable(route = "detail/{sportName}") { backStackEntry ->
            val sportName = backStackEntry.arguments?.getString("sportName")
            SportDetailScreen(sportName = sportName)
        }
    }
}

@Composable
fun SportDetailScreen(sportName: String?) {
    val selectedSport = SportEnum.entries.firstOrNull { it.name == sportName }
}