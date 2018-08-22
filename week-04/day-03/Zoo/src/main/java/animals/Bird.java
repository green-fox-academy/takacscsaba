package main.java.animals;

public class Bird extends Animal {

  public Bird(String name) {
    this.name = name;
    age = 3;
    cute = false;
  }

  @Override
  public void getName() {
    name = "dove";
  }

  @Override
  public void breed() {
    System.out.println("laying eggs");
  }

  @Override
  public void speak() {
    System.out.println("gulugy");
  }
}
