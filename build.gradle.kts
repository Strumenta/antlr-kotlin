buildscript {
    val kotlinVersion = "1.7.21"

    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
        maven("https://oss.jfrog.org/oss-snapshot-local/")
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

// a small hack: the variable must be named like the property
// jitpack will pass -Pversion=..., so `val version` is required here.
val version: String by project
// we create an alias here...
val versionProperty = version
// do the same for group
val group: String by project
val groupProperty = if (group.endsWith(".antlr-kotlin")) {
    group
} else {
    // just another jitpack hack
    "$group.antlr-kotlin"
}

allprojects {
    // ... because `version` is another var here.
    // when version is hardcoded here, jitpack can not overwrite it.
    // the default version can now be changed in gradle.properties
    version = versionProperty
    group = groupProperty

    tasks.withType<JavaCompile> {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
        options.compilerArgs.add("-Xlint:all")
        options.isDeprecation = true
    }

    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
        maven("https://oss.jfrog.org/oss-snapshot-local/")
    }
}

tasks.withType<Wrapper> {
    gradleVersion = "7.5.1"
    distributionType = Wrapper.DistributionType.ALL
}
