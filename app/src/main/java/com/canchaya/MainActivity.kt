package com.canchaya

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import com.canchaya.navigation.BottomBar
import com.canchaya.navigation.NavHostComposable
import com.canchaya.ui.theme.CanchaYaTheme


import androidx.activity.viewModels


class MainActivity : ComponentActivity() {
    private val mainViewModel: Auth0ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel.setContext(this)

        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            CanchaYaTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomBar(navController::navigate)
                    }
                ) { innerPadding ->
                    NavHostComposable(innerPadding, navController, mainViewModel)
                }
            }
        }
    }
}
