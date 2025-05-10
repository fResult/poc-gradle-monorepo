# POC Monorepo for Gradle Kotlin DSL

## Prerequisite

- JDK 23

## Project Structure

```console
➜ tree
.
├── main-project
│   ├── src/
│   └── build.gradle.kts
├── ext-project-1
│   ├── src/
│   └── build.gradle.kts
├── ext-project-2
│   ├── src/
│   └── build.gradle.kts
├── build.gradle.kts
├── settings.gradle.kts
└── gradle/
    └── libs.versions.toml
```

## Available Scripts

**Build:**

```console
➜ ./gradlew build
Reusing configuration cache.

BUILD SUCCESSFUL in 682ms
10 actionable tasks: 10 up-to-date
Configuration cache entry reused.
```

**Run:**

```console
➜ ./gradlew runApp
[Sub-project] Hello from Library!
```
