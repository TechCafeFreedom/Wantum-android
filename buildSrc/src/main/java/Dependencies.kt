import dependencies.Libs
import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies

fun Project.baseDependencies(additionalConfiguration: DependencyHandlerScope.() -> Unit) {
    dependencies {
        implementation(Libs.Kotlin.stdlib)
        implementation(Libs.Kotlin.coroutinesCore)
        implementation(Libs.AndroidX.appCompat)
        implementation(Libs.AndroidX.coreKtx)
        implementation(Libs.AndroidX.constraint)
    }
    dependencies(additionalConfiguration)
}

fun Project.testDependencies() {
    dependencies {
        testImplementation(Libs.Test.junit)
        androidTestImplementation(Libs.Test.androidJunit)
        androidTestImplementation(Libs.Test.espressoCore)
    }
}

private fun DependencyHandler.implementation(depName: Any) {
    add("implementation", depName)
}

private fun DependencyHandler.kapt(depName: Any) {
    add("kapt", depName)
}

private fun DependencyHandler.testImplementation(depName: Any) {
    add("testImplementation", depName)
}

private fun DependencyHandler.androidTestImplementation(depName: Any) {
    add("androidTestImplementation", depName)
}