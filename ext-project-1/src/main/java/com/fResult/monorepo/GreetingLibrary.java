package com.fResult.monorepo;

import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class GreetingLibrary {
  public static String hello(@Nullable String serviceName) {
    return Optional.ofNullable(serviceName)
        .map(it -> "[" + it + "] Hello from Library!")
        .orElse("[Unknown] Hello from Library!");
  }

  public static String hello() {
    return hello(null);
  }

  private GreetingLibrary() {
    throw new IllegalStateException("This cannot be instantiated");
  }
}
