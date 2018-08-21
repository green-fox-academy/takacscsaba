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

    info(yellow, blue, purple, orange);

    System.out.println();
    garden.watering(yellow, blue, purple, orange, 40);
    info(yellow, blue, purple, orange);


    System.out.println();
    garden.watering(yellow, blue, purple, orange, 70);
    info(yellow, blue, purple, orange);
  }

  public static void info(Flower flower, Flower flower2, Tree tree, Tree tree2) {
    flower.infoFlower(flower);
    flower2.infoFlower(flower2);
    tree.infoTree(tree);
    tree2.infoTree(tree2);
  }
}
