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
}
//    fight
//    It should take another carrier as a refrence parameter and fire all the ammo from the aircrafts to it, than substract all the damage from it's health points
