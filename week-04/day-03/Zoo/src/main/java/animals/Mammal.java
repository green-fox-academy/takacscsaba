package main.java.animals;

public class Mammal extends Animal {

  public Mammal(String name) {
    this.name = name;
    age = 7;
    cute = true;
  }

  @Override
  public void getName() {
    name = "fox";
  }

  @Override
  public void breed() {
    System.out.println("pushing miniature versions out");
  }

  @Override
  public void speak() {
    System.out.println("kiiiiiikiiii");
  }
}
