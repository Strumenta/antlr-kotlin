plugins {
  id("strumenta.jvm.library")
}

dependencies {
  api(libs.antlr4)
}

publishing {
  publications {
    create<MavenPublication>("mavenJava") {
      from(components["java"])
    }
  }
}
