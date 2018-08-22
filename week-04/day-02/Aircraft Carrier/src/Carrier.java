import java.util.ArrayList;
import java.util.List;

public class Carrier {
  List<Aircraft> carrierList = new ArrayList<>();
  String carrierName;
  int carrierAmmo;
  int healthPoint;

  public Carrier(String carrierName, int carrierAmmo, int healthPoint) {
    this.carrierName = carrierName;
    this.carrierAmmo = carrierAmmo;
    this.healthPoint = healthPoint;
  }

  public void add() {
    carrierList.add(new F16());
    carrierList.add(new F16());
    carrierList.add(new F35());
    carrierList.add(new F35());
    carrierList.add(new F35());
  }

  public void add2() {
    carrierList.add(new F35());
    carrierList.add(new F35());
    carrierList.add(new F35());
  }

  public void fill() {
    if (carrierAmmo == 0) {
      throw new ArithmeticException("Ammo null");
    }
    for (int i = 0; i < carrierList.size(); i++) {
      if (carrierAmmo < 36) {
        if (carrierList.get(i).isPriority()) {
          carrierList.get(i).refill(carrierAmmo);
          carrierAmmo -= carrierList.get(i).ammo;
        }
      } else {
        carrierList.get(i).refill(carrierAmmo);
        carrierAmmo -= carrierList.get(i).ammo;
      }
    }
  }

  public void fight(Carrier otherCarrier) {
    int damageCarrier = 0;
    int damageOtherCarrier = 0;
    for (int i = 0; i < carrierList.size(); i++) {
      if (carrierList.get(i).ammo != 0) {
        damageCarrier = carrierList.get(i).fight();
        otherCarrier.healthPoint -= damageCarrier;
      }
    }
    for (int i = 0; i < otherCarrier.carrierList.size(); i++) {
      if (otherCarrier.carrierList.get(i).ammo != 0) {
        damageOtherCarrier = otherCarrier.carrierList.get(i).fight();
        healthPoint -= damageOtherCarrier;
      }
    }
    if (otherCarrier.healthPoint < 0) {
      System.out.println("It's dead Jim!");
    }
    if (healthPoint < 0) {
      System.out.println("We're dead Jim!");
    }
//    else {
//      System.out.println(healthPoint);
//      System.out.println(otherCarrier.healthPoint);
//    }
  }

  public String getStatus() {
    int totalDamage = 0;
    for (int i = 0; i < carrierList.size(); i++) {
      totalDamage += carrierList.get(i).ammo * carrierList.get(i).baseDamage;
    }
    String status = ("HP: " + healthPoint + ", Aircraft count: " + carrierList.size() + 1 + ", Ammo Storage: " + carrierAmmo + ", Total damage: " + totalDamage + "\nAircrafts:\n");

    for (int i = 0; i < carrierList.size(); i++) {
      status += carrierList.get(i).getStatus() + "\n";
    }
    return status;
  }
}
