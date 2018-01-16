apply {
    from("normal.build.gradle")
}
dependencies {
    "implementation"(project(":common-jvm"))
}
