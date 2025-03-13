package com.example.canchaya.components

import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.canchaya.screens.data.SportEnum

@Composable
fun SportButton(
    sport: SportEnum,
    onClick: (SportEnum) -> Unit
) {
    val name = stringResource(sport.nameResId)
    val icon = painterResource(sport.iconResId)

    ExtendedFloatingActionButton(
        icon = { Icon( icon, contentDescription = name) },
        text = { Text(name) },
        onClick = { onClick(sport) }
    )
}