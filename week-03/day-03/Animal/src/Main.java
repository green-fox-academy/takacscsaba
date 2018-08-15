public class Main {

  public static void main(String[] args) {
    Animal cat = new Animal();
    cat.drink();
    System.out.println(cat.thirst);

    Animal dog = new Animal();
    dog.eat();
    System.out.println(dog.hunger);

    Animal monkey = new Animal();
    monkey.play();
    System.out.println(monkey.thirst);
    System.out.println(monkey.hunger);
  }
}
