import java.util.List;

public class Flower extends Garden {
  float waterAmount;
  String name;

  public void needsWater(Flower flower) {
    if (flower.waterAmount < 5) {
      System.out.println("The " + name + " Flower needs water");
    } else {
      System.out.println("The " + name + " Flower doesn't need water");
    }
  }

  public void watering(float waterAmount, List<Flower> flowers) {
    this.waterAmount = waterAmount;
    for (int i = 0; i < flowers.size(); i++) {
      flowers.get(i).waterAmount = (waterAmount / 100) * 75;
    }
  }

  public Flower(String name, float waterAmount) {
    this.name = name;
    this.waterAmount = waterAmount;
  }

  public Flower() {
    waterAmount = 0;
    name = "flowerish";
  }
}
//  needs water if its current water amount is less then 5
//    when watering it the flower can only absorb the 75% of the water
//    eg. watering with 10 the flower's amount of water should only increase with 7.5