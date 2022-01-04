pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}
rootProject.name = "kotodo"

include(":client:androidApp")
include(":client:jsApp")
include(":client:desktopApp")
include(":client:compose")
include(":client:shared")
