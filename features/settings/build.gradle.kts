import dependencies.baseExtension
import dependencies.Libs

plugins {
    id("com.android.library")
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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

baseDependencies {
    implementation(Libs.AndroidX.navFragmentKtx)

    implementation(Libs.Hilt.android)
    implementation(Libs.Hilt.common)
    implementation(Libs.Hilt.lifecycleViewModel)
    kapt(Libs.Hilt.compiler)
    kapt(Libs.Hilt.androidCompiler)
}
testDependencies()

kapt {
    correctErrorTypes = true
}