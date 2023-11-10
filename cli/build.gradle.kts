repositories.mavenCentral()

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

kotlin {
    macosArm64 {
        binaries.executable()
    }
    linuxX64 {
        binaries.executable()
    }
    sourceSets {
        getByName("commonMain") {
            kotlin.srcDirs("src/common/main/kotlin")
            dependencies {
                implementation(project(":shared"))
            }
        }
        getByName("macosArm64Main") {
            kotlin.srcDirs("src/macos/arm64/main/kotlin")
        }
        getByName("linuxX64Main") {
            kotlin.srcDirs("src/linux/x64/main/kotlin")
        }
    }
}
