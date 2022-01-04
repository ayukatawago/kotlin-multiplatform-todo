package dev.kotodo.compose

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import dev.kotodo.shared.Platform

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    Button(
        onClick = {
            text = "Hello, ${Platform().platform}"
        }
    ) {
        Text(text)
    }
}
