
plugins {
  java
  kotlin("jvm") version "2.1.20"
  application
}

java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(23)
  }
}

repositories {
  mavenCentral()
}

application {
  mainClass = "com.fResult.monorepo.MainApplication"
}

dependencies {
  implementation(project(":ext-project-2"))
}

tasks.register<JavaExec>("runApp") {
  mainClass = "com.fResult.monorepo.MainApplication"
  classpath = sourceSets["main"].runtimeClasspath + sourceSets["main"].output
  sourceSets["main"].output.forEach { it.display() }
  classpath.forEach(::println)
}

fun Any.display() = println("[DISPLAY] $this" )

