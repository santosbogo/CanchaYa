package com.example.canchaya.screens.sports

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.canchaya.components.SportButton
import com.example.canchaya.screens.sports.data.SportEnum

@Composable
fun Sports(
    onClick: (String) -> Unit
) {
    val sports = SportEnum.entries.toList()

    LazyVerticalGrid(
        columns = GridCells.Fixed(2), // ← dos columnas
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(sports) { sport ->
            SportButton(
                sport = sport,
                onClick = { onClick(sport.name) }
            )
        }
    }
}