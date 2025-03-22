package com.example.canchaya.components

import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.canchaya.screens.sports.data.SportEnum

@Composable
fun SportButton(
    sport: SportEnum,
    onClick: (SportEnum) -> Unit
) {
    val name = sport.sportName
    val icon = painterResource(sport.iconResId)

    FloatingActionButton(
        onClick = { onClick(sport) }
    ) {
        Icon( icon, contentDescription = name)
    }
}