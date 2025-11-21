package zed.rainxch.githubstore

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Github Store",
    ) {
        App()
    }
}