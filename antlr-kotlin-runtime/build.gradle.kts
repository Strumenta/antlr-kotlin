plugins {
    `java-library`
    `maven-publish`    
    signing
    kotlin("multiplatform")
    kotlin("kapt")
}

dependencies {
    compile("org.antlr:antlr4:${Versions.antlr}")  
    implementation(kotlin("stdlib-jdk8")) 
}

kotlin {
    // default targets for jvm and js
    jvm() {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"            
        }
    }
    
    js()

    sourceSets {

        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }                    

        jvm().compilations["main"].defaultSourceSet {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }        

        jvm().compilations["main"].kotlinOptions {            
           jvmTarget = "1.8"           
        }

        jvm().compilations["test"].kotlinOptions {            
           jvmTarget = "1.8"           
        }
        
        jvm().compilations["test"].defaultSourceSet {
            dependencies {                
                implementation(kotlin("reflect"))
                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
            }
        }
        
        js().compilations["main"].defaultSourceSet {                        
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }            

        js().compilations["main"].kotlinOptions {            
            metaInfo = true
            outputFile = "${project.buildDir.path}/js/${project.name}.js"
            sourceMap = true
            moduleKind = "umd"            
        }
        
        js().compilations["test"].defaultSourceSet {
            dependencies {
                implementation(kotlin("test-js"))                
            }            
        }

        js().compilations["test"].kotlinOptions {            
            metaInfo = true            
            sourceMap = true
            moduleKind = "umd"            
        }            
    }    
}

// login data for sonatype repository
val ossrhUsername: String by project
val ossrhPassword: String by project

// we need to ask a custom task for javadoc
// this is necessary to be published on Maven Central
tasks {
    val javadocJar by creating(Jar::class) {
        dependsOn(JavaPlugin.JAVADOC_TASK_NAME)
        classifier = "javadoc"
        from(javadoc)
    }

    artifacts {        
        add("archives", javadocJar)
    }    

    test {
        dependsOn("jvmTest")
    }    
}

// data for publishing the package
publishing {
    publications.withType<MavenPublication>().apply {
        val metadata by getting {            
            artifact(tasks["javadocJar"])
            pom {
                name.set("ANTLR Kotlin Metadata")
                description.set("Metadata for ANTLR Kotlin runtime")
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
        val jvm by getting {            
            artifact(tasks["javadocJar"]) 
            pom {
                name.set("ANTLR Kotlin Runtime JVM")
                description.set("Kotlin JVM runtime for ANTLR")
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
        val js by getting {            
            artifact(tasks["javadocJar"])
            pom {
                name.set("ANTLR Kotlin Runtime JS")
                description.set("Kotlin JS runtime for ANTLR")
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

// to sign packages
signing {        
    sign(publishing.publications["metadata"])
    sign(publishing.publications["jvm"])
    sign(publishing.publications["js"])        
}