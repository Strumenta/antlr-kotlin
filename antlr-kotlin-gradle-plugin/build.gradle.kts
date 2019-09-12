plugins {
    `java-library`
    `maven-publish`
}

dependencies {
    compile("org.antlr:antlr4:${Versions.antlr}")
    compile(gradleApi())
    compile(project(":antlr-kotlin-target"))
}

publishing {
    publications {
        register("mavenJava", MavenPublication::class) {
            from(components["java"])
        }
    }
}
