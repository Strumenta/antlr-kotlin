buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
        maven("https://oss.jfrog.org/oss-snapshot-local/")
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
    }
}

group = ProjectInfo.group
version = ProjectInfo.version

allprojects {
    group = ProjectInfo.group
    version = ProjectInfo.version

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
