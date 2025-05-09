val javaProjects: List<Project> = listOf(
  project(":ext-project-1"),
  project(":ext-project-2"),
  project(":main-project"),
)

configure(javaProjects) {
//  val project = this
  println("Project: ${project.name}")
  apply(plugin = "application")
  version = "1.0.0"

  repositories {
    mavenCentral()
  }

  dependencies {
//    implementation("I Cannot resolve implementation here, I don't know why this cannot be resolved")
  }

  tasks.withType<Test> {
    useJUnitPlatform()
  }
}