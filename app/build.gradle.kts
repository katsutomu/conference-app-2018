
plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("org.jlleitschuh.gradle.ktlint")
    id("io.fabric")
    id("com.github.ben-manes.versions")
}

apply {
    from("normal.build.gradle")
}

dependencies {
    implementation(project(":common-jvm"))
}
