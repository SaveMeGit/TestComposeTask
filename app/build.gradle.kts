plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)

    kotlin("kapt")
    alias (libs.plugins.hilt.application)
    alias(libs.plugins.devTools.ksp)
}

android {
    namespace = "com.example.testcomposetask"
    compileSdk = 34

    hilt {
        enableAggregatingTask = true
        enableExperimentalClasspathAggregation = true
    }

    defaultConfig {
        applicationId = "com.example.testcomposetask"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation(libs.androidx.material.icons.extended)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.androidx.appcompat)

    implementation (libs.ui)
//    implementation (libs.androidx.material)
    implementation (libs.ui.tooling.preview)
    implementation (libs.androidx.runtime.livedata)

    // For using Compose in Fragments
    implementation (libs.androidx.fragment.ktx)

    // Room for Database
    implementation(libs.androidx.room.runtime.v251)
    kapt(libs.androidx.room.compiler.v251)
//    ksp(libs.androidx.room.compiler.v251)

    // Hilt for Dependency Injection
//    implementation(libs.hilt.android.v245)
//    kapt(libs.hilt.compiler.v245)

    // Dagger Hilt
    implementation(libs.hilt.android.v245)
    kapt(libs.hilt.compiler.v2481)

    // For instrumentation tests
    androidTestImplementation(libs.hilt.android.testing)
    kaptAndroidTest(libs.hilt.compiler.v250)

    // For local unit tests
    testImplementation(libs.hilt.android.testing)
    kaptTest(libs.hilt.compiler.v250)

    // Navigation
    implementation(libs.androidx.navigation.compose)

    implementation(libs.retrofit)
    implementation(libs.converter.gson)

    implementation(libs.androidx.constraintlayout)

}

kapt {
    correctErrorTypes = true
}