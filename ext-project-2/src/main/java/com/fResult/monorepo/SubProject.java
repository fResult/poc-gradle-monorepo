package com.fResult.monorepo;

import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.function.Function;

public class SubProject {
  public String hello(@Nullable String name) {
    final var greeting = GreetingLibrary.hello("Sub-project");

    return Optional.ofNullable(name).map(greetWithName(greeting)).orElse(greeting);
  }

  public String hello() {
    return hello(null);
  }

  private Function<String, String> greetWithName(String greeting) {
    return name -> greeting.replace("!", String.format(" %s!", name));
  }
}
