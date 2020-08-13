import dependencies.baseExtension
import dependencies.Libs

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

apply{
    file("gradle/projectDependencyGraph.gradle")
}

android {
    baseExtension()
}

baseDependencies {
    implementation(project(":model"))
    implementation(project(":data:api"))

    implementation(Libs.Firebase.auth)
    implementation(Libs.Firebase.playServicesAuth)
    implementation(Libs.Hilt.android)
    kapt(Libs.Hilt.androidCompiler)
}
testDependencies()