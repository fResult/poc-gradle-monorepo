plugins {
  java
//  kotlin("jvm") version("2.1.20")
  application
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(project(":ext-project-1"))
}
