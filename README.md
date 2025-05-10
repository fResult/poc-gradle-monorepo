# POC Monorepo for Gradle Kotlin DSL

This is a POC repository that build to support of [`Learning Webflux 3.0`][learning-webflux-repo] repository.

## Prerequisite

- JDK 23

## Project Structure

```console
➜ tree
.
├── build.gradle.kts
├── settings.gradle.kts
├── main-project/
│    ├── src/
│    └── build.gradle.kts
├── ext-project-1/
│    ├── src/
│    └── build.gradle.kts
├── ext-project-2/
│    ├── src/
│    └── build.gradle.kts
└── gradle/
     └── libs.versions.toml
```

## Available Scripts

**Build:**

```console
# For Unix
➜ ./gradlew build
BUILD SUCCESSFUL in 682ms
10 actionable tasks: 10 up-to-date
Configuration cache entry reused.

# For Windows
> .\gradlew.bat runApp
BUILD SUCCESSFUL in 682ms
10 actionable tasks: 10 up-to-date
Configuration cache entry reused.
```

**Run:**

```console
# For Unix
➜ ./gradlew runApp
[Sub-project] Hello from Library!

# For Windows
> .\gradlew.bat runApp
[Sub-project] Hello from Library!
```

<!-- References -->
[learning-webflux-repo]: https://github.com/fResult/Learn-Spring-Webflux-3.0