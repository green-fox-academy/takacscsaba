package main.java.animals;

public class Reptile extends Animal {

  public Reptile(String name) {
    this.name = name;
    age = 65000000;
    cute = true;
  }

  @Override
  public void getName() {
    name = "bronto";
  }

  @Override
  public void breed() {
    System.out.println("laying eggs");
  }

  @Override
  public void speak() {
    System.out.println("kvavakvkavka");
  }
}
