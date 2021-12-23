pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}
rootProject.name = "kotlin-multiplatform-todo"

include(":androidApp")
project(":androidApp").projectDir = file("client/androidApp")
include(":jsApp")
project(":jsApp").projectDir = file("client/jsApp")
include(":desktopApp")
project(":desktopApp").projectDir = file("client/desktopApp")
include(":shared")
project(":shared").projectDir = file("client/shared")
