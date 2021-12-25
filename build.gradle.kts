buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        // Need XCode 12.5 to use 1.6.10
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("com.android.tools.build:gradle:4.2.2")
        classpath("org.jlleitschuh.gradle:ktlint-gradle:10.1.0")
    }
}

allprojects {
    group = "com.example"
    version = "1.0"

    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
