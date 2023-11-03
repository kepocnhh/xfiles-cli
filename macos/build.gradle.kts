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
                implementation(project(":shared"))
            }
        }
        getByName("macosArm64Main") {
            kotlin.srcDirs("src/arm64/main/kotlin")
        }
    }
}
