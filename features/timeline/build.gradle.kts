import dependencies.baseExtension
import dependencies.BuildConfig
import dependencies.Libs

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("com.google.gms.google-services")
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
    implementation(project(":features:auth"))
    implementation(project(":features:settings"))
    implementation(project(":core"))
    implementation(project(":model"))
    implementation(project(":data:repository"))

    implementation(Libs.AndroidX.fragmentKts)
    implementation(Libs.Firebase.analytics)
    implementation(Libs.AndroidX.navigationFragment)
    implementation(Libs.AndroidX.navigationUi)
    implementation(Libs.AndroidX.navigationRuntime)
}
testDependencies()
