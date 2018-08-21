public class Main {

  public static void main(String[] args) {

    Garden garden = new Garden();
    Flower yellow = new Flower("yellow", 0);
    garden.addFlower(yellow);
    Flower blue = new Flower("blue", 0);
    garden.addFlower(blue);

    Tree purple = new Tree("purple", 0);
    garden.addTree(purple);
    Tree orange = new Tree("orange", 0);
    garden.addTree(orange);

    garden.infoPlants(yellow, blue, purple, orange);

    System.out.println();
    garden.watering(yellow, blue, purple, orange, 40);
    garden.infoPlants(yellow, blue, purple, orange);

    System.out.println();
    garden.watering(yellow, blue, purple, orange, 70);
    garden.infoPlants(yellow, blue, purple, orange);
  }
}
