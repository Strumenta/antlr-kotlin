rootProject.name = "antlr-kotlin"

include(
        "antlr-kotlin-runtime",
        "antlr-kotlin-target",
        "antlr-kotlin-gradle-plugin"
)

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "kotlin-multiplatform") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
        }
    }
}

enableFeaturePreview("GRADLE_METADATA")