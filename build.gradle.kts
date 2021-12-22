buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        // Need XCode 12.5 to use 1.6.10
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("com.android.tools.build:gradle:4.2.2")
    }
}

group = "com.example"
version = "1.0"

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
