package com.canchaya.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.canchaya.Auth0ViewModel
import com.canchaya.screens.reservations.Reservations
import com.canchaya.screens.security.Login
import com.canchaya.screens.sports.SportDetail
import com.canchaya.screens.sports.Sports
import com.canchaya.screens.sports.data.SportEnum
import com.canchaya.screens.user.User

@Composable
fun NavHostComposable(innerPadding: PaddingValues, navController: NavHostController, mainViewModel: Auth0ViewModel) {

    NavHost(
        navController = navController,
        startDestination = "Login",
//        startDestination = CanchaYaScreen.Sports.name,
        modifier = Modifier.fillMaxSize().padding(innerPadding).padding(20.dp)
    ) {

        composable (route = "Login") {
            Login(mainViewModel)
        }

        composable (route = CanchaYaScreen.Sports.name) {
            Sports(
                onClick = { navController.navigate(it) }
            )
        }

        composable (route = CanchaYaScreen.Reservations.name) {
            Reservations()
        }

        composable (route = CanchaYaScreen.User.name) {
            User()
        }

        composable ("{sportName}") { backStackEntry ->
            val sportName = backStackEntry.arguments?.getString("sportName")
            val sport = SportEnum.valueOf(sportName ?: SportEnum.TENNIS.name)
            SportDetail(sport)
        }
    }
}