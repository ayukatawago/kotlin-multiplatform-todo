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
include(":shared")
project(":shared").projectDir = file("client/shared")
