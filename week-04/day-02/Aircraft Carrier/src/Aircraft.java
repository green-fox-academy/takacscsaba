public class Aircraft {
  int maxAmmo;
  int baseDamage;
  String type;
  int ammo = 0;

  public Aircraft(String type, int maxAmmo, int baseDamage, int ammo) {
    this.type = type;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.ammo = ammo;
  }

  public void fight(Aircraft otherAircraft) {
    int aircraftDamage = ammo * baseDamage;
    int otherAircraftDamage = otherAircraft.ammo * otherAircraft.baseDamage;
    for (int i = ammo; i >= 1; i--) {
      ammo--;
    }
    for (int i = otherAircraft.ammo; i >= 1; i--) {
      otherAircraft.ammo--;
    }
    System.out.println(type + " aircraft caused " + aircraftDamage + " damage.");
    System.out.println(otherAircraft.type + " aircraft caused " + otherAircraftDamage + " damage.");
  }

  public void refill(int ammoFill) {
    int remainingAmmo = 0;
    for (int i = 1; i <= ammoFill; i++) {
      if (i <= maxAmmo) {
        ammo++;
      } else {
        remainingAmmo++;
      }
    }
    System.out.println(remainingAmmo);
  }

  public String getType(Aircraft aircraft) {
    return aircraft.type;
  }

  public String getStatus(Aircraft aircraft) {
    String status = "Type " + aircraft.type + ", Ammo:" + aircraft.ammo + ", Base Damage: " + aircraft.baseDamage + ", All Damage: " + aircraft.ammo * aircraft.baseDamage;
    return status;
  }

  public boolean isPriority(Aircraft aircraft) {
    if (aircraft.type == "F35") {
      return true;
    } else {
      return false;
    }
  }
}