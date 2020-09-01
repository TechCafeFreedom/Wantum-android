import dependencies.baseExtension
import dependencies.Libs

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    baseExtension()
}

baseDependencies {
    implementation(project(":model"))

    implementation(Libs.OkHttp.client)
    implementation(Libs.OkHttp.loggingInterceptor)
    api(Libs.Retrofit.retrofit)
    api(Libs.Retrofit.converterMoshi)
    implementation(Libs.Moshi.moshi)
    implementation(Libs.Moshi.kotlin)
    implementation(Libs.Hilt.android)
    kapt(Libs.Hilt.androidCompiler)

}
testDependencies()