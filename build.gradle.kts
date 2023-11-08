buildscript {
    repositories.mavenCentral()

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}")
    }
}

repositories.mavenCentral() // https://stackoverflow.com/questions/77422092/

task<Delete>("clean") {
    delete = setOf(layout.buildDirectory.get(), "buildSrc/build")
}
