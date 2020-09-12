import dependencies.baseExtension
import dependencies.BuildConfig
import dependencies.Libs

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

apply{
    file("gradle/projectDependencyGraph.gradle")
}

android {
    baseExtension()
    defaultConfig.applicationId = BuildConfig.applicationId

    kotlinOptions {
        jvmTarget = "1.8"
    }

    @Suppress("UnstableApiUsage")
    buildFeatures {
        dataBinding = true
    }
}

baseDependencies {
    implementation(project(":features:auth"))
    implementation(project(":features:memories"))
    implementation(project(":features:wannado"))
    implementation(project(":features:timeline"))
    implementation(project(":features:settings"))
    implementation(project(":core"))
    implementation(project(":model"))
    implementation(project(":data:repository"))
    implementation(Libs.AndroidX.fragmentKts)
    implementation(Libs.Firebase.analytics)
    implementation(Libs.AndroidX.navFragmentKtx)
    implementation(Libs.AndroidX.navUi)
    implementation(Libs.AndroidX.navRuntime)
    implementation(Libs.Hilt.android)
    implementation(Libs.Hilt.common)
    implementation(Libs.Hilt.lifecycleViewModel)
    kapt(Libs.Hilt.compiler)
    kapt(Libs.Hilt.androidCompiler)
    implementation(Libs.Epoxy.dataBinding)
    implementation(Libs.Epoxy.epoxy)
    kapt(Libs.Epoxy.processor)
    debugImplementation(Libs.Hyperion.core)
    debugImplementation(Libs.Hyperion.attr)
    debugImplementation(Libs.Hyperion.measurement)
    debugImplementation(Libs.Hyperion.disk)
    debugImplementation(Libs.Hyperion.recorder)
    debugImplementation(Libs.Hyperion.phoenix)
    debugImplementation(Libs.Hyperion.crash)
    debugImplementation(Libs.Hyperion.preferences)
    debugImplementation(Libs.Hyperion.counter)
    debugImplementation(Libs.Hyperion.buildConfig)
    debugImplementation(Libs.Hyperion.plugin)
    debugImplementation(Libs.Hyperion.timber)
    debugImplementation(Libs.Hyperion.http)
}
testDependencies()

kapt {
    correctErrorTypes = true
}
