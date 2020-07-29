import dependencies.baseExtension
import dependencies.Libs

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
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
        viewBinding = true
    }
}

baseDependencies {
    implementation(Libs.AndroidX.navigationFragment)
    implementation(Libs.AndroidX.navigationUi)
    implementation(Libs.AndroidX.navigationRuntime)
}

testDependencies()