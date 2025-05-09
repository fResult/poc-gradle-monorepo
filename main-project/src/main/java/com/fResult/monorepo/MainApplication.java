package com.fResult.monorepo;

public class MainApplication {
  public static void main(String[] args) {
    final var greeting = new MainApplication().getGreeting();

    System.out.println(greeting);
  }

  public String getGreeting() {
    final var subProject = new SubProject();
    return subProject.hello();
  }
}
