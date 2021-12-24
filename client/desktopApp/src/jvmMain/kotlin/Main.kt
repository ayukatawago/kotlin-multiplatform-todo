import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.compose.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Test"
    ) {
        App()
    }
}
