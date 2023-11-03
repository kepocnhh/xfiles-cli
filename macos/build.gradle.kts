repositories.mavenCentral()

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

kotlin {
    macosArm64 {
        binaries.executable()
    }
    sourceSets {
        getByName("commonMain") {
            dependencies {
                implementation(project(":common"))
            }
        }
        getByName("macosArm64Main") {
            kotlin.srcDirs("src/macos/arm64/main/kotlin")
        }
    }
}
