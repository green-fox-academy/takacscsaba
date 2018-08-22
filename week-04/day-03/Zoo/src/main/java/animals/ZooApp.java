package main.java.animals;

public class ZooApp {
  public static void main(String[] args) {
    Reptile reptile = new Reptile("Bronto");
    Mammal mammal = new Mammal("Fox");
    Bird bird = new Bird("Dove");

    System.out.println("How do you breed?");
    System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed() + ", and its voice sounds like this " + reptile.sound() + ".");
    System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed() + ", and its voice sounds like this " + mammal.sound() + ".");
    System.out.println("A " + bird.getName() + " is breeding by " + bird.breed() + ", and its voice sounds like this " + bird.sound() + ".");
  }
}
