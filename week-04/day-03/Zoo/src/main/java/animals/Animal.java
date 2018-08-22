package main.java.animals;

public abstract class Animal {
  String name;
  int age;
  boolean cute;

  public abstract String getName();

  public abstract String breed();

  public abstract String sound();
}
