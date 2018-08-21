import java.util.ArrayList;
import java.util.List;

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

    needsWater(yellow, blue, purple, orange);
    garden.watering(garden, 40);

  }

  public static void needsWater(Flower flower, Flower flower2, Tree tree, Tree tree2) {
    flower.needsWater(flower);
    flower2.needsWater(flower2);
    tree.needsWater(tree);
    tree2.needsWater(tree2);
  }
}
