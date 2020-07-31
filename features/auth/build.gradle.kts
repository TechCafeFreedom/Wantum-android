import dependencies.baseExtension
import dependencies.Libs
import java.util.Properties
import java.io.FileInputStream

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    baseExtension()

    defaultConfig {
        // local.propertiesの読み込み
        val properties = Properties()
        properties.load(FileInputStream(project.rootProject.file("local.properties")))
        val requestIdToken = properties.getProperty("REQUEST_ID_TOKEN")
        buildConfigField("String", "REQUEST_ID_TOKEN", "\"${requestIdToken}\"")

    }

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
    implementation(project(":data:repository"))
    implementation(project(":features:resource"))
    implementation(project(":model"))
    implementation(project(":core"))

    implementation(Libs.AndroidX.liveDataKts)
    implementation(Libs.liveEvent)
    implementation(Libs.AndroidX.fragmentKts)
    implementation(Libs.AndroidX.activityKts)
    implementation(Libs.Firebase.core)
    implementation(Libs.Firebase.auth)
    implementation(Libs.Firebase.playServicesAuth)
}
testDependencies()