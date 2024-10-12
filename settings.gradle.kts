pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        jcenter()
    }
//    resolutionStrategy {
//        eachPlugin {
//            if (requested.id.id == "dagger.hilt.android.plugin") {
//                useModule("com.google.dagger:hilt-android-gradle-plugin:2.50")
//            }
//        }
//    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}

rootProject.name = "Test Compose Task"
include(":app")
 