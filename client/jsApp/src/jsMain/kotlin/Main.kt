import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import dev.kotodo.shared.Platform
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

fun main() {
    var count: Int by mutableStateOf(0)

    renderComposable(rootElementId = "root") {
        Div(
            attrs = {
                style { padding(25.px) }
            }
        ) {
            Text(Platform().platform)
        }
        Div(
            attrs = {
                style { padding(25.px) }
            }
        ) {
            Button(
                attrs = {
                    onClick { count -= 1 }
                }
            ) {
                Text("-")
            }

            Span(
                attrs = {
                    style { padding(15.px) }
                }
            ) {
                Text("$count")
            }

            Button(
                attrs = {
                    onClick { count += 1 }
                }
            ) {
                Text("+")
            }
        }
    }
}
