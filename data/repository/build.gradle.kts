import dependencies.baseExtension
import dependencies.Libs

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

apply{
    file("gradle/projectDependencyGraph.gradle")
}

android {
    baseExtension()
}

baseDependencies {
    implementation(project(":model"))

    implementation(Libs.Firebase.auth)
    implementation(Libs.Firebase.playServicesAuth)
}
testDependencies()