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
import com.example.canchaya.screens.sports.SportDetail
import com.example.canchaya.screens.sports.Sports
import com.example.canchaya.screens.sports.data.SportEnum

@Composable
fun NavHostComposable(innerPadding: PaddingValues, navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = CanchaYaScreen.Sports.name,
        modifier = Modifier.fillMaxSize().padding(innerPadding).padding(20.dp)
    ) {

        composable(route = CanchaYaScreen.Sports.name) {
            Sports(
                onClick = { navController.navigate(it) }
            )
        }

        composable("{sportName}") { backStackEntry ->
            val sportName = backStackEntry.arguments?.getString("sportName")
            val sport = SportEnum.valueOf(sportName ?: SportEnum.TENNIS.name)
            SportDetail(sport)
        }
    }
}