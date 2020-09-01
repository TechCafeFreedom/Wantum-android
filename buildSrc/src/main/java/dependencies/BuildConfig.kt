package dependencies

import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion

object BuildConfig {
    const val applicationId = "com.techcafe.wantum"
    const val versionCode = 1
    const val versionName = "1.0"
    const val androidTargetSdkVersion = 29
    const val androidCompileSdkVersion = 29
    const val androidMinSdkVersion = 23
    const val buildToolsVersion = "29.0.3"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val consumerProguardFiles = "consumer-rules.pro"
}

fun BaseExtension.baseExtension() {
    compileSdkVersion(BuildConfig.androidCompileSdkVersion)
    buildToolsVersion(BuildConfig.buildToolsVersion)

    defaultConfig {
        minSdkVersion(BuildConfig.androidMinSdkVersion)
        targetSdkVersion(BuildConfig.androidTargetSdkVersion)
        versionCode = BuildConfig.versionCode
        versionName = BuildConfig.versionName

        testInstrumentationRunner = BuildConfig.testInstrumentationRunner
        consumerProguardFiles(BuildConfig.consumerProguardFiles)
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}