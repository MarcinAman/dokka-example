package greeteer

import example.Clock

actual class Platform {
    actual fun getPlatform() = "JVM"
}

val xd = Clock("XD").property