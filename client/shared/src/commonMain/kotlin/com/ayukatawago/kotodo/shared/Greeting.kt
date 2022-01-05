package com.ayukatawago.kotodo.shared

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
