import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import dev.kotodo.compose.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Test"
    ) {
        App()
    }
}
