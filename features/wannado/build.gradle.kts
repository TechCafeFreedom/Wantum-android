import dependencies.baseExtension
import dependencies.Libs

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
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
    implementation(project(":core"))
    implementation(project(":model"))
    implementation(project(":data:repository"))
    implementation(project(":features:resource"))

    implementation(Libs.AndroidX.fragmentKts)
    implementation(Libs.Firebase.analytics)
    implementation(Libs.AndroidX.navFragmentKtx)
    implementation(Libs.AndroidX.navUi)
    implementation(Libs.AndroidX.navRuntime)
    implementation(Libs.Epoxy.dataBinding)
    implementation(Libs.Epoxy.epoxy)
    kapt(Libs.Epoxy.processor)

}
testDependencies()
kapt {
    correctErrorTypes = true
    showProcessorTimings = true
}
