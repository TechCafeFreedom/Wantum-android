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
        const val hyperion = "0.9.29"
        const val jitpack = "1.0.0"
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

    object Hyperion {
        val core = "com.willowtreeapps.hyperion:hyperion-core:${Versions.hyperion}"
        val attr = "com.willowtreeapps.hyperion:hyperion-attr:${Versions.hyperion}"
        val measurement =
            "com.willowtreeapps.hyperion:hyperion-measurement:${Versions.hyperion}"
        val disk = "com.willowtreeapps.hyperion:hyperion-disk:${Versions.hyperion}"
        val recorder = "com.willowtreeapps.hyperion:hyperion-recorder:${Versions.hyperion}"
        val phoenix = "com.willowtreeapps.hyperion:hyperion-phoenix:${Versions.hyperion}"
        val crash = "com.willowtreeapps.hyperion:hyperion-crash:${Versions.hyperion}"
        val preferences =
            "com.willowtreeapps.hyperion:hyperion-shared-preferences:${Versions.hyperion}"
        val counter = "com.willowtreeapps.hyperion:hyperion-geiger-counter:${Versions.hyperion}"
        val buildConfig =
            "com.willowtreeapps.hyperion:hyperion-build-config:${Versions.hyperion}"
        val plugin = "com.willowtreeapps.hyperion:hyperion-plugin:${Versions.hyperion}"
        val timber = "com.willowtreeapps.hyperion:hyperion-timber:${Versions.hyperion}"
        val http = "com.github.Commit451:Hyperion-Chuck:${Versions.jitpack}"
    }
}
