// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.3" apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
}

buildscript {
    repositories {
        google()
    }
    dependencies {
        val navVersion = "2.7.1"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navVersion")
    }
}