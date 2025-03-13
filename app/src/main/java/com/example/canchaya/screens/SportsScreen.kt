package com.example.canchaya.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.canchaya.components.SportButton
import com.example.canchaya.screens.data.SportEnum

@Composable
fun SportsScreen(
    onSportSelected: (SportEnum) -> Unit
) {
    val sports = SportEnum.entries.toTypedArray()

    Column (
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        sports.forEach { sport ->
            SportButton(
                sport = sport,
                onClick = onSportSelected
            )
        }
    }
}