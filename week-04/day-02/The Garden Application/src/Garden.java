import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Flower> flowers = new ArrayList<Flower>();
  List<Tree> trees = new ArrayList<Tree>();
  float waterAmount;
  String name;


  public void addFlower(Flower flower) {
    flowers.add(flower);
  }

  public void addTree(Tree tree) {
    trees.add(tree);
  }

  public void watering(Garden garden, float water) {
    this.waterAmount = waterAmount;
    waterAmount += water;
    System.out.println("Watering with " + water);
  }

  public Garden(String name) {
    this.name = name;
    flowers = new ArrayList<Flower>();
    trees = new ArrayList<Tree>();
  }

  public Garden() {
  }
}
//  is able to hold unlimited amount of flowers or trees
//  when watering it should only water those what needs water with equally divided amount amongst them
//  eg. watering with 40 and 4 of them need water then each gets watered with 10