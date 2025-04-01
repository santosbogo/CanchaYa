package com.canchaya.screens.sports.data

import com.canchaya.navigation.CanchaYaScreen
import com.canchaya.R

enum class SportEnum (
    val sportName: String,
    val iconResId: Int,
){
    TENNIS(CanchaYaScreen.Tennis.name, R.drawable.tennis),
    PADDLE(CanchaYaScreen.Paddle.name, R.drawable.paddle),
    FOOTBALL(CanchaYaScreen.Football.name, R.drawable.football),
    RUGBY(CanchaYaScreen.Rugby.name, R.drawable.rugby),
    FIELD_HOCKEY(CanchaYaScreen.FieldHockey.name, R.drawable.field_hockey),
    BASKETBALL(CanchaYaScreen.Basketball.name, R.drawable.basketball),
    VOLLEYBALL(CanchaYaScreen.Volleyball.name, R.drawable.volleyball),
    BADMINTON(CanchaYaScreen.Badminton.name, R.drawable.badminton),
}