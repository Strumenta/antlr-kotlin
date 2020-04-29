plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

repositories {
    mavenCentral()
    mavenLocal()
}

apply(plugin = "maven-publish")

kotlin {
    jvm()
    js {
        browser {
        }
        nodejs {
        }
    }

    // Create a target for the host platform.
    val hostTarget = System.getProperty("os.name").let { hostOs ->
        when {
            hostOs == "Mac OS X" -> macosX64("native")
            hostOs == "Linux" -> linuxX64("native")
            hostOs.startsWith("Windows") -> mingwX64("native")
            else -> null
        }
    }
    hostTarget?.apply {
        binaries {
            staticLib()
        }
    }
    sourceSets {
        commonMain {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation(kotlin("reflect"))
                implementation("com.soywiz.korlibs.korio:korio:1.10.1")
                implementation("com.benasher44:uuid:0.1.0")
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
        val nativeMain by getting {
        }
        val nativeTest by getting {
        }
    }
}
