buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
        maven("https://oss.jfrog.org/oss-snapshot-local/")
    }

    dependencies {
        // minimum version required because of https://youtrack.jetbrains.com/issue/KT-29758
        classpath(kotlin("gradle-plugin", version = "1.3.31"))
    }    
}

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile    

allprojects {
    group = "com.strumenta.antlr-kotlin"
    version = "0.0.4"
    
    tasks.withType<JavaCompile> {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
        options.compilerArgs.add("-Xlint:all")      
        options.setDeprecation(true)
    }

    tasks.withType<KotlinCompile> {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
        kotlinOptions.jvmTarget = "1.8"       
    }

    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
        maven("https://oss.jfrog.org/oss-snapshot-local/")
    }
}
