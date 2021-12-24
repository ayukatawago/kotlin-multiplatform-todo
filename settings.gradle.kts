pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}
rootProject.name = "kotlin-multiplatform-todo"

include(":client:androidApp")
include(":client:jsApp")
include(":client:desktopApp")
include(":client:compose")
include(":client:shared")
