package com.example.agualist

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {

    Column(modifier = modifier) {

        WellnessTasksList()
    }

}
