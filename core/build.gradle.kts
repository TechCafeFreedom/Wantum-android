import dependencies.baseExtension
import dependencies.Libs

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    baseExtension()
}

baseDependencies {
    implementation(Libs.AndroidX.navigationFragment)
    implementation(Libs.AndroidX.navigationUi)
    implementation(Libs.AndroidX.navigationRuntime)
}

testDependencies()