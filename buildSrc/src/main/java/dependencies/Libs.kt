package dependencies

object Libs {
    object Versions {
        const val kotlin = "1.3.72"
        const val fragment = "1.3.0-alpha06"
        const val activity = "1.2.0-alpha06"
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
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:2.3.0"
        const val navigationUi = "androidx.navigation:navigation-ui-ktx:2.3.0"
        const val navigationRuntime = "androidx.navigation:navigation-runtime-ktx:2.3.0"

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
}