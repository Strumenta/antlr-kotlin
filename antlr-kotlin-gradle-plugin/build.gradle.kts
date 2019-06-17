plugins {
    `java-gradle-plugin`
    `java-library`
    `maven-publish`
    id("com.gradle.plugin-publish") version "0.10.0"
}

dependencies {
    compile("org.antlr:antlr4:${Versions.antlr}")
    compile(gradleApi())
    compile(project(":antlr-kotlin-target"))
}

pluginBundle {
    website = "https://github.com/Strumenta/antlr-kotlin" 
    vcsUrl = "https://github.com/Strumenta/antlr-kotlin.git" 
    tags = listOf("antlr", "kotlin", "parsing") 
}

gradlePlugin {
    plugins {
        create("antlr-kotlin") {
            id = "com.strumenta.antlr-kotlin"
            displayName = "ANTLR Kotlin"
            description = "Kotlin target for ANTLR. Generate multi-platform parsers in Kotlin"
            implementationClass = "com.strumenta.antlrkotlin.gradleplugin.AntlrKotlinPlugin"
        }
    }
}

val jar by tasks.getting(Jar::class) {
    manifest {
        // used by AntlrKotlinPluginExtension
        attributes["Implementation-Version"] = project.version
    }
}

publishing {
    publications {
        register("mavenJava", MavenPublication::class) {
            from(components["java"])
        }
    }
}
