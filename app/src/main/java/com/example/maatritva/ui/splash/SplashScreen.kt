package com.example.maatritva.ui.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.maatritva.R
import com.example.maatritva.ui.theme.LightYellow
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    onSplashFinished: () -> Unit,
    isOnboardingCompleted: Boolean
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LightYellow),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ma),
            contentDescription = "Splash Logo",
            Modifier.size(350.dp)
        )
    }

    LaunchedEffect(key1 = true) {
        delay(2000) 
        onSplashFinished()
    }
}