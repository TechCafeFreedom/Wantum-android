import dependencies.baseExtension

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    baseExtension()

    @Suppress("UnstableApiUsage")
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

baseDependencies {
}
