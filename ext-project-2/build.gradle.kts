plugins {
  java
  kotlin("jvm") version("2.1.20")
}

java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(23)
  }
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(project(":ext-project-1"))
}
