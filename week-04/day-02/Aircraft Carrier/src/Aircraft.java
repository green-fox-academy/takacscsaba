public class Aircraft {
  int maxAmmo;
  int baseDamage;
  String name;

  public Aircraft(String name, int maxAmmo, int baseDamage) {
    this.name = name;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    int ammo = 0;
  }
}
//    F16
//    Max ammo: 8
//    Base damage: 30
//    F35
//    Max ammo: 12
//    Base damage: 50
//    All the aircrafts should be created with empty ammo store
//
//    Methods:
//    fight
//    It should use all the ammos (set it to 0) and it should return the damage it deals
//    The damage is the multiplication of the base damage and the ammos
//    refill
//    It should take a number as parameter and substract as much ammo as possibe
//    It can't have more ammo than the number or the max ammo
//    It should return the remaining ammo
//    Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288
//    getType
//    It should return it's type as a string
//    getStatus
//    It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
//    isPriority
//    It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16