package com.example.compose

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import com.example.shared.Platform

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    Button(onClick = {
        text = "Hello, ${Platform().platform}"
    }) {
        Text(text)
    }
}
