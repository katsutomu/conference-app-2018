import org.gradle.api.tasks.Delete
import org.gradle.kotlin.dsl.extra
import org.gradle.kotlin.dsl.maven
import org.gradle.kotlin.dsl.repositories

buildscript {
    val kotlinVersion by extra { "1.2.10" }

    repositories {
        google()
        jcenter()
        maven(url = "https://plugins.gradle.org/m2/")
        maven(url = "https://maven.fabric.io/public")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.0.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("com.google.gms:google-services:3.1.0")
        classpath("gradle.plugin.org.jlleitschuh.gradle:ktlint-gradle:3.0.0")
        classpath("io.fabric.tools:gradle:1.25.1")
        classpath("com.github.ben-manes:gradle-versions-plugin:0.17.0")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

task("clean", Delete::class) {
    delete = setOf(rootProject.buildDir)
}
