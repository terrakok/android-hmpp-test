pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
        maven {
            url = uri("https://dl.bintray.com/kotlin/kotlin-dev")
        }
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id.startsWith("com.android.library")) {
                useModule("com.android.tools.build:gradle:${requested.version}")
            }
        }
    }
}
rootProject.name = "AndroidHmppLibTest"

