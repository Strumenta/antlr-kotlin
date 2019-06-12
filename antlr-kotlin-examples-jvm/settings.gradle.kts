pluginManagement {
    repositories {
        // used for local development and while building by travis ci and jitpack.io
        mavenLocal()
        // used to download antlr-kotlin gradle plugin
        gradlePluginPortal()
    }
}
