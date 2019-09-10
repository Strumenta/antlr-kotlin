rootProject.name = "antlr-kotlin"

include(
        "antlr-kotlin-runtime",
        "antlr-kotlin-target",
        "antlr-kotlin-gradle-plugin"
)

// Enables KotlinMultiplatform publication and resolving (in dependencies)
enableFeaturePreview("GRADLE_METADATA")
