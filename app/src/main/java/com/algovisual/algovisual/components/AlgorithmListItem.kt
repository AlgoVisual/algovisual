package com.algovisual.algovisual.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.algovisual.algovisual.models.Algorithm
import com.algovisual.algovisual.ui.theme.Typography

@Composable
fun AlgorithmListItem(algorithm: Algorithm) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
    ) {
        Text(
            text = "Algorithm ${algorithm.name}",
            style = Typography.bodyLarge,
            modifier = Modifier
                .align(Alignment.CenterStart)
        )
        Divider()
    }
}