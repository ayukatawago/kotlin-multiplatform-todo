plugins {
    id("com.android.application")
    id("org.jetbrains.compose") version "1.0.1"
    kotlin("android")
    id("org.jlleitschuh.gradle.ktlint")
}

dependencies {
    implementation(project(":client:compose"))
    implementation("androidx.activity:activity-compose:1.4.0")
}

android {
    compileSdkVersion(31)
    defaultConfig {
        applicationId = "com.example.androidApp"
        minSdkVersion(24)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}
