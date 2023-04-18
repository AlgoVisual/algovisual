package com.algovisual.algovisual.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.algovisual.algovisual.components.AlgorithmListItem
import com.algovisual.algovisual.models.Algorithm

@Composable
fun HomeScreen() {
    val algorithms = listOf(
        Algorithm(
            name = "Bubble Sort",
            description = "Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.",
            complexity = "O(n^2)",
            image = "https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif",
            code = "",
            type = "Sorting",
            link = "https://en.wikipedia.org/wiki/Bubble_sort",
        ),
        Algorithm(
            name = "Insertion Sort",
            description = "Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.",
            complexity = "O(n^2)",
            image = "https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif",
            code = "",
            type = "Sorting",
            link = "https://en.wikipedia.org/wiki/Insertion_sort",
        ),
        Algorithm(
            name = "Selection Sort",
            description = "Selection sort is a sorting algorithm, specifically an in-place comparison sort. It has O(n2) time complexity, making it inefficient on large lists, and generally performs worse than the similar insertion sort.",
            complexity = "O(n^2)",
            image = "https://upload.wikimedia.org/wikipedia/commons/9/94/Selection-Sort-Animation.gif",
            code = "",
            type = "Sorting",
            link = "https://en.wikipedia.org/wiki/Selection_sort",
        ),
    )

    return LazyColumn(
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