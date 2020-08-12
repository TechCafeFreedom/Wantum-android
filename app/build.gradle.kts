import dependencies.baseExtension
import dependencies.BuildConfig
import dependencies.Libs

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("com.google.gms.google-services")
    id("dagger.hilt.android.plugin")
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
    implementation(project(":features:memories"))
    implementation(project(":features:wannado"))
    implementation(project(":features:timeline"))
    implementation(project(":features:settings"))
    implementation(project(":features:resource"))
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
}
testDependencies()

kapt {
    correctErrorTypes = true
}
