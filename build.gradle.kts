buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
        maven("https://oss.jfrog.org/oss-snapshot-local/")
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$embeddedKotlinVersion")
    }
}

allprojects {
    group = "com.strumenta.antlr-kotlin"
    version = "0.0.5"

    tasks.withType<JavaCompile> {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
        options.compilerArgs.add("-Xlint:all")
        options.setDeprecation(true)
    }

    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
        maven("https://oss.jfrog.org/oss-snapshot-local/")
    }
}
