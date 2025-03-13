package com.example.canchaya

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.canchaya.ui.theme.CanchaYaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CanchaYaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier.fillMaxSize().padding(innerPadding)
                    ) {
                        Row(
                            modifier = Modifier.weight(1f)
                        ) {
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .weight(1f)
                                    .fillMaxSize()
                                    .padding(8.dp)
                            ) {
                                Icon(
                                    painterResource(R.drawable.tennis),
                                    contentDescription = "Tennis",
                                )
                            }

                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .weight(1f)
                                    .fillMaxSize()
                                    .padding(8.dp)
                            ) {
                                Icon(
                                    painterResource(R.drawable.paddle),
                                    contentDescription = "Paddle"
                                )
                            }
                        }

                        Row(
                            modifier = Modifier
                                .weight(1f)
                        ) {
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .weight(1f)
                                    .fillMaxSize()
                                    .padding(8.dp)
                            ) {
                                Icon(
                                    painterResource(R.drawable.football),
                                    contentDescription = "Football"
                                )
                            }
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .weight(1f)
                                    .fillMaxSize()
                                    .padding(8.dp)
                            ) {
                                Icon(
                                    painterResource(R.drawable.volleyball),
                                    contentDescription = "Volleyball"
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CanchaYaTheme {
        Greeting("Android")
    }
}