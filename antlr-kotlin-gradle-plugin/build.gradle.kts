plugins {
    `java-gradle-plugin`
    `java-library`
    `maven-publish`
}

dependencies {
    compile("org.antlr:antlr4:${Versions.antlr}")
    compile(gradleApi())
    compile(project(":antlr-kotlin-target"))
}

gradlePlugin {
    plugins {
        create("antlr-kotlin") {
            id = "com.strumenta.antlr-kotlin"
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
