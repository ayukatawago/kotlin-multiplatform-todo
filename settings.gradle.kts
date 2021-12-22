pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
    }
    
}
rootProject.name = "kotlin-multiplatform-todo"


include(":androidApp")
include(":shared")

