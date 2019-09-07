plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

repositories {
    mavenCentral()
    mavenLocal()
}
group = "org.antlr"
version = "0.0.1"

apply(plugin = "maven-publish")

kotlin {
    jvm()
    js {
        browser {
        }
        nodejs {
        }
    }
    // For ARM, should be changed to iosArm32 or iosArm64
    // For Linux, should be changed to e.g. linuxX64
    // For MacOS, should be changed to e.g. macosX64
    // For Windows, should be changed to e.g. mingwX64
//    mingwX64("mingw")
    sourceSets {
        commonMain {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation(kotlin("reflect"))
                implementation("com.soywiz.korlibs.korio:korio:1.8.1")
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
            }
        }
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
//        val mingwMain by getting {
//        }
//        val mingwTest by getting {
//        }
    }

    // Note that the Kotlin metadata is here, too.
    // The mingwx64() target is automatically skipped as incompatible in Linux builds.
    configure(listOf(metadata(), jvm(), js())) {
        mavenPublication {
            val targetPublication = this@mavenPublication
            tasks.withType<AbstractPublishToMaven>()
                    .matching { it.publication == targetPublication }
                    .all { onlyIf { findProperty("isLinux") == "true" } }
        }
    }
}
