package dependencies

object Libs {
    private object Versions {
        val Kotlin = "1.3.61"
    }

    object Kotlin {
        val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.Kotlin}"
    }

    object AndroidX {
        val appCompat = "androidx.appcompat:appcompat:1.1.0"
        val coreKtx = "androidx.core:core-ktx:1.3.0"
        val constraint = "androidx.constraintlayout:constraintlayout:1.1.3"
    }

    object Test {
        val junit = "junit:junit:4.12"
        val androidJunit = "androidx.test.ext:junit:1.1.1"
        val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
    }
}