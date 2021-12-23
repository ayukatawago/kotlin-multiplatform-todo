plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose") version "1.0.1"
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val jsMain by getting {
            dependencies {
                implementation(project(":shared"))
                implementation(compose.web.core)
                implementation(compose.runtime)
            }
        }
    }
}
