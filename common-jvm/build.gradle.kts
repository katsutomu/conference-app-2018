
plugins {
    id("kotlin-platform-jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to arrayOf("*.jar"))))
    compile("org.jetbrains.kotlin:kotlin-stdlib-jre7")
    expectedBy(project(":common"))
}
