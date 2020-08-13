package dependencies

object Libs {
    object Versions {
        const val kotlin = "1.3.72"
        const val fragment = "1.3.0-alpha06"
        const val activity = "1.2.0-alpha06"
        const val navigation = "2.3.0"
        const val hilt = "2.28-alpha"
        const val hiltSnap = "1.0.0-SNAPSHOT"
        const val epoxy = "3.11.0"
        const val okHttp = "4.8.1"
        const val retrofit = "2.9.0"
        const val moshi = "1.9.3"
    }

    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
        const val coroutinesCore =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.6"
    }

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:1.1.0"
        const val coreKtx = "androidx.core:core-ktx:1.3.0"
        const val constraint = "androidx.constraintlayout:constraintlayout:1.1.3"
        const val fragmentKts = "androidx.fragment:fragment-ktx:${Versions.fragment}"
        const val activityKts = "androidx.activity:activity-ktx:${Versions.activity}"
        const val liveDataKts = "androidx.lifecycle:lifecycle-livedata-ktx:2.2.0"
        const val navUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
        const val navRuntime = "androidx.navigation:navigation-runtime-ktx:${Versions.navigation}"
        const val navFragmentKtx =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    }

    object Hilt {
        const val android = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val androidCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
        const val common = "androidx.hilt:hilt-common:${Versions.hiltSnap}"
        const val lifecycleViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltSnap}"
        const val compiler = "androidx.hilt:hilt-compiler:${Versions.hiltSnap}"
    }

    const val liveEvent = "com.github.hadilq.liveevent:liveevent:1.0.1"

    object Test {
        const val junit = "junit:junit:4.12"
        const val androidJunit = "androidx.test.ext:junit:1.1.1"
        const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
    }

    object Firebase {
        const val core = "com.google.firebase:firebase-core:17.4.4"
        const val analytics = "com.google.firebase:firebase-analytics:17.4.4"
        const val auth = "com.google.firebase:firebase-auth:19.3.2"
        const val playServicesAuth = "com.google.android.gms:play-services-auth:18.1.0"
    }

    object Epoxy {
        const val epoxy = "com.airbnb.android:epoxy:${Versions.epoxy}"
        const val dataBinding = "com.airbnb.android:epoxy-databinding:${Versions.epoxy}"
        const val processor = "com.airbnb.android:epoxy-processor:${Versions.epoxy}"
    }

    object OkHttp {
        const val client = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val converterMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    }

    object Moshi {
        const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
        const val kotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    }
}
