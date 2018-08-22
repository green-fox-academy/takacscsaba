package main.java.animals;

public class Reptile extends Animal {

  public Reptile(String name) {
    this.name = name;
    age = 65000000;
    cute = true;
  }

  public Reptile(){
    name = "Bronto";
    age = 65000000;
    cute = true;
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
    return "kvavakvkavka";
  }
}
