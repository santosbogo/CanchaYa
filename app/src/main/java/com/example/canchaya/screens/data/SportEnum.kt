package com.example.canchaya.screens.data

import com.example.canchaya.R

enum class SportEnum (
    val nameResId: Int,
    val iconResId: Int,
){
    TENNIS(R.string.tennis, R.drawable.tennis),
    PADDLE(R.string.paddle, R.drawable.paddle),
    FOOTBALL(R.string.football, R.drawable.football),
    RUGBY(R.string.rugby, R.drawable.rugby),
    FIELD_HOCKEY(R.string.field_hockey, R.drawable.field_hockey),
    BASKETBALL(R.string.basketball, R.drawable.basketball),
    VOLLEYBALL(R.string.volleyball, R.drawable.volleyball),
    BADMINTON(R.string.badminton, R.drawable.badminton),
}