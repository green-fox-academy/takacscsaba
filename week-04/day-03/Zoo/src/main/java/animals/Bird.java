package main.java.animals;

public class Bird extends Animal implements Flyable {

  public Bird(String name) {
    this.name = name;
    age = 3;
    cute = false;
  }

  public Bird() {
    name = "Dove";
    age = 3;
    cute = false;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public String sound() {
    return "gulugy";
  }

  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeOff() {

  }
}
