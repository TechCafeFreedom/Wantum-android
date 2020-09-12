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

    @Suppress("UnstableApiUsage")
    buildFeatures {
        dataBinding = true
    }
}

baseDependencies {
}
