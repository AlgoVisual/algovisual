package com.algovisual.algovisual.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.algovisual.algovisual.models.Algorithm

@Composable
fun AlgorithmList(algorithms: List<Algorithm>) {

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        algorithms.forEach { algorithm ->
            item {
                AlgorithmListItem(algorithm = algorithm)
            }
        }
    }
}