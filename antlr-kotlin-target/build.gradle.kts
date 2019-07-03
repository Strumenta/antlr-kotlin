plugins {
    `java-library`
    `maven-publish`    
    signing
    kotlin("jvm")
}

dependencies {
    compile("org.antlr:antlr4:${Versions.antlr}")      
    implementation(kotlin("stdlib")) 
}

tasks.register<Jar>("sourcesJar") {    
    from(sourceSets.main.get().allSource)
    archiveClassifier.set("sources")
}

tasks.register<Jar>("javadocJar") {
    from(tasks.javadoc.get().destinationDir)
    archiveClassifier.set("javadoc")    
}

// login data for sonatype repository
val ossrhUsername: String by project
val ossrhPassword: String by project

// data for publishing
publishing {
    publications {
        create<MavenPublication>("mavenJava") {            
            from(components["java"])
            artifact(tasks["sourcesJar"]) // required for Maven Central
            artifact(tasks["javadocJar"]) // required for Maven Central
			pom {
                name.set("ANTLR Kotlin Target")
                description.set("Support for Kotlin as a target language for ANTLR")
                url.set("https://github.com/Strumenta/antlr-kotlin")                
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("ftomassetti")
                        name.set("Federico Tomassetti")
                        email.set("federico@strumenta.com")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/Strumenta/antlr-kotlin.git")
                    developerConnection.set("scm:git:ssh://github.com:Strumenta/antlr-kotlin.git")
                    url.set("http://github.com/simpligility/ossrh-demo/tree/master")
                }
            }
        }
    }

    repositories {
        maven {
			name = "ANTLR Kotlin"
            val releasesRepoUrl = "https://oss.sonatype.org/service/local/staging/deploy/maven2/"
            val snapshotsRepoUrl = "https://oss.sonatype.org/content/repositories/snapshots/"
            url = uri(if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl)			
			credentials {
                username = ossrhUsername
                password = ossrhPassword                
            }
        }
    }
}

// to sign the package
signing {
    sign(publishing.publications["mavenJava"])    
}