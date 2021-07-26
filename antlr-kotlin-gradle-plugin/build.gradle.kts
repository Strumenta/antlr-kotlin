plugins {
    `java-library`
    `maven-publish`
}

dependencies {
    implementation("org.antlr:antlr4:${Versions.antlr}")
    implementation(gradleApi())
    implementation(project(":antlr-kotlin-target"))
}

publishing {
    publications {
        register("mavenJava", MavenPublication::class) {
            from(components["java"])
        }
    }
}
