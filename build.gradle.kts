// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    }

//dependencias
    buildscript {
        dependencies {
            implementation ("androidx.core:core-ktx:1.12.0")
            implementation ("androidx.appcompat:appcompat:1.6.1")
            implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
            implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
            implementation ("androidx.recyclerview:recyclerview:1.3.2")
            implementation ("androidx.room:room-runtime:2.6.1")
            classpath("com.google.dagger:hilt-android-gradle-plugin:2.48")


        }
    }

fun implementation(s: String) {

}
