public class Tree {
  float waterAmount;
  String name;

  public boolean needsWater(Tree tree) {
    if (tree.waterAmount < 10) {
      return true;
    } else {
      return false;
    }
  }

  public void infoTree(Tree tree) {
    if (tree.waterAmount < 10) {
      System.out.println(tree.waterAmount);
      System.out.println("The " + name + " Tree needs water");
    } else {
      System.out.println(tree.waterAmount);
      System.out.println("The " + name + " Tree doesn't need water");
    }
  }

  public void watering(Tree tree, float water) {
    if (tree.waterAmount < 10) {
      tree.waterAmount += water * 0.4;
    } else {
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