import dependencies.baseExtension
import dependencies.BuildConfig
import dependencies.Libs

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("com.google.gms.google-services")
}
android {
    baseExtension()
    defaultConfig.applicationId = BuildConfig.applicationId

    @Suppress("UnstableApiUsage")
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

baseDependencies {
    implementation(project(":features:auth"))
    implementation(project(":features:settings"))
    implementation(project(":features:resource"))
    implementation(project(":core"))
    implementation(project(":model"))
    implementation(project(":data:repository"))

    implementation(Libs.AndroidX.fragmentKts)
    implementation(Libs.Firebase.analytics)
}
testDependencies()
