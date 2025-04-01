package com.canchaya.screens.sports

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.canchaya.screens.sports.data.SportEnum

@Composable
fun SportDetail(sport: SportEnum) {
    Text("Available courts for: ${sport.sportName}")
}