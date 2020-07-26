import dependencies.baseExtension

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    baseExtension()
}

baseDependencies {
}
testDependencies()