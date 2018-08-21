import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Flower> flowers = new ArrayList<Flower>();
  List<Tree> trees = new ArrayList<Tree>();
  String name;


  public void addFlower(Flower flower) {
    flowers.add(flower);
  }

  public void addTree(Tree tree) {
    trees.add(tree);
  }

  public void watering(Flower flower, Flower flower2, Tree tree, Tree tree2, float water) {
    System.out.println("Watering with " + (int) water);
    int sum = needsWaterFlow(flower, flower2, tree, tree2);

    wateringFunction(flower, flower2, tree, tree2, water / sum);
  }

  public Garden(String name) {
    this.name = name;
    flowers = new ArrayList<Flower>();
    trees = new ArrayList<Tree>();
  }

  public Garden() {
  }


  public int needsWaterFlow(Flower flower, Flower flower2, Tree tree, Tree tree2) {
    int x = 0;
    if (flower.needsWater(flower)) {
      x++;
    }
    if (flower2.needsWater(flower2)) {
      x++;
    }
    if (tree.needsWater(tree)) {
      x++;
    }
    if (tree2.needsWater(tree2)) {
      x++;
    }
    return x;
  }

  public void wateringFunction(Flower flower, Flower flower2, Tree tree, Tree tree2, float water) {
    flower.watering(flower, water);
    flower2.watering(flower2, water);
    tree.watering(tree, water);
    tree2.watering(tree2, water);
  }

  public static void infoPlants(Flower flower, Flower flower2, Tree tree, Tree tree2) {
    flower.infoFlower(flower);
    flower2.infoFlower(flower2);
    tree.infoTree(tree);
    tree2.infoTree(tree2);
  }
}