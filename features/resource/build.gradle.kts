import dependencies.baseExtension

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

apply{
    file("gradle/projectDependencyGraph.gradle")
}

android {
    baseExtension()
}

baseDependencies {
}
