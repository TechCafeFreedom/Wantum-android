import dependencies.baseExtension
import dependencies.BuildConfig

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}
android {
    baseExtension()
    defaultConfig.applicationId = BuildConfig.applicationId
}

baseDependencies {
}
testDependencies()
