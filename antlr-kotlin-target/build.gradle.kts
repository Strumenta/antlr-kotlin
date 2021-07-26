plugins {
    `java-library`
    `maven-publish`
}

dependencies {
    api("org.antlr:antlr4:${Versions.antlr}")
}

publishing {
    publications {
        register("mavenJava", MavenPublication::class) {
            from(components["java"])
        }
    }
}
