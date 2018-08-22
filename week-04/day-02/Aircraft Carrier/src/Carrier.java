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
    carrierList.add(new Aircraft("F16", 8, 30, 0));
    carrierList.add(new Aircraft("F16", 8, 30, 0));
    carrierList.add(new Aircraft("F35", 12, 50, 0));
    carrierList.add(new Aircraft("F35", 12, 50, 0));
    carrierList.add(new Aircraft("F35", 12, 50, 0));
  }

  public void fill() {
    if (carrierAmmo == 0) {
      throw new ArithmeticException("Ammo null");
    }
//    for (int i = 0; i < carrierList.size(); i++) {
//      if (carrierAmmo < 52) {
//        if (carrierList.get(i).isPriority(carrierList.get(i)))
//          carrierList.get(i).refill(carrierAmmo);
//      } else {
//        carrierList.get(i).refill(carrierAmmo);
//        System.out.println(carrierAmmo + " asd");
//      }
//    }
  }
}
//    fill
//    It should fill all the aircraft with ammo and substract the needed ammo from the ammo storage
//    If there is not enough ammo than it should start to fill the aircraftis with priority first
//    If there is no ammo when this method is called it should throw an exception

//    fight
//    It should take another carrier as a refrence parameter and fire all the ammo from the aircrafts to it, than substract all the damage from it's health points
