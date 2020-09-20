import dependencies.baseExtension
import dependencies.Libs

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("androidx.navigation.safeargs.kotlin")
}

apply{
    file("gradle/projectDependencyGraph.gradle")
}

android {
    baseExtension()

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    @Suppress("UnstableApiUsage")
    buildFeatures {
        dataBinding = true
    }
}

baseDependencies {

    implementation(Libs.AndroidX.design)
    implementation(Libs.AndroidX.navFragmentKtx)
    implementation(Libs.AndroidX.navUi)
    implementation(Libs.AndroidX.navRuntime)
}

testDependencies()