import java.util.List;

public class Tree extends Garden {
  float waterAmount;
  String name;


  public void needsWater(Tree tree) {
    if (tree.waterAmount < 10) {
      System.out.println("The " + name + " Tree needs water");
    } else {
      System.out.println("The " + name + " Tree doesn't need water");
    }
  }

  public void watering(float waterAmount, List<Tree> trees) {
    this.waterAmount = waterAmount;
    for (int i = 0; i < trees.size(); i++) {
      trees.get(i).waterAmount = (waterAmount / 100) * 45;
    }
  }

  public Tree(String name, float waterAmount) {
    this.name = name;
    this.waterAmount = waterAmount;
  }

  public Tree() {
    name = "treeish";
    waterAmount = 0;
  }
}
//  needs water if its current water amount is less then 10
//    when watering it the tree can only absorb the 40% of the water
//    eg. watering with 10 the tree's amount of water should only increase with 4