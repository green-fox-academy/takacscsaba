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

  public Aircraft() {
  }

  public int fight() {
    int aircraftDamage = ammo * baseDamage;
    for (int i = ammo; i >= 1; i--) {
      ammo--;
    }
    System.out.println(type + " aircraft caused " + aircraftDamage + " damage.");
    return aircraftDamage;
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

  public String getType() {
    return type;
  }

  public String getStatus() {
    String status = "Type " + type + ", Ammo:" + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + ammo * baseDamage;
    return status;
  }

  public boolean isPriority() {
    return type.equals("F35");
  }
}