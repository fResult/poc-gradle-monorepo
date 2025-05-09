plugins {
  java
  kotlin("jvm") version "2.1.20"
  application
}

repositories {
  mavenCentral()
}

application {
  mainClass = "subproject.Application"
}

dependencies {
  implementation(project(":ext-project-2"))
}

tasks.register<Jar>("fatJar") {
  description = "test"
  group = "com.fResult"

  archiveClassifier = "fat"

  from(sourceSets.main.get().output)

  dependsOn(configurations.runtimeClasspath)
  from(({
    configurations.runtimeClasspath.get()
      .filter { it.name.endsWith("jar") }
      .map { zipTree(it) }
  }))

  manifest {
    attributes["Main-Class"] = "com.fResult.monorepo.Application"
  }

  duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.withType<JavaExec> {
  mainClass = "subproject.Application"
  classpath = sourceSets["main"].runtimeClasspath + sourceSets["main"].output
  println("Log ClassPath: $classpath")
}
