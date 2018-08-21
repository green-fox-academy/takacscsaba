public class Flower {
  float waterAmount;
  String name;

  public boolean needsWater(Flower flower) {
    if (flower.waterAmount < 5) {
      return true;
    } else {
      return false;
    }
  }

  public void infoFlower(Flower flower) {
    if (flower.waterAmount < 5) {
      System.out.println(flower.waterAmount);
      System.out.println("The " + name + " Flower needs water");
    } else {
      System.out.println(flower.waterAmount);
      System.out.println("The " + name + " Flower doesn't need water");
    }
  }

  public void watering(Flower flower, float water) {
    if (flower.waterAmount < 5) {
      flower.waterAmount += water * 0.75;
    } else {
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