package main.java.animals;

public class Mammal extends Animal {

  public Mammal(String name) {
    this.name = name;
    age = 7;
    cute = true;
  }

  public Mammal() {
    name = "Fox";
    age = 7;
    cute = true;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String breed() {
    return "pushing miniature versions out";
  }

  @Override
  public String sound() {
    return "kiiiiiikiiii";
  }
}
