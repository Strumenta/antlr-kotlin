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
    js(BOTH) {
        browser {
        }
        nodejs {
        }
    }

    ios("ios") {
        binaries {
            staticLib()
        }
    }
    linuxArm64 {
        binaries {
            staticLib()
        }
    }
    linuxX64 {
        binaries {
            staticLib()
        }
    }
    macosArm64 {
        binaries {
            staticLib()
        }
    }
    macosX64 {
        binaries {
            staticLib()
        }
    }
    mingwX64("windows") {
        binaries {
            staticLib()
        }
    }
    sourceSets {
        commonMain {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation(kotlin("reflect"))
                implementation("com.benasher44:uuid:0.7.1")
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
        val nativeMain by creating {
        }
        val iosMain by getting {
            dependsOn(nativeMain)
        }
        val linuxMain by creating {
            dependsOn(nativeMain)
        }
        val linuxArm64Main by getting {
            dependsOn(linuxMain)
        }
        val linuxX64Main by getting {
            dependsOn(linuxMain)
        }
        val macMain by creating {
            dependsOn(nativeMain)
        }
        val macosArm64Main by getting {
            dependsOn(macMain)
        }
        val macosX64Main by getting {
            dependsOn(macMain)
        }
        val windowsMain by getting {
            dependsOn(nativeMain)
        }
    }
}
