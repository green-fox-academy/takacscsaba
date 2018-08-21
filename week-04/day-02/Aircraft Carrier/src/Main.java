public class Main {

  public static void main(String[] args) {
    Aircraft f16 = new Aircraft("F16", 8, 30, 0);
    Aircraft f35 = new Aircraft("F35", 12, 50, 0);

    f16.refill(300);
    System.out.println(f16.ammo);
    f35.refill(300);
    System.out.println(f35.ammo);
    System.out.println();

    System.out.println(f16.getStatus(f16));
    System.out.println(f35.getStatus(f35));
    System.out.println();

    f16.fight(f35);
    System.out.println(f16.ammo);
    System.out.println(f35.ammo);
    System.out.println();

    System.out.println(f16.getType(f16));
    System.out.println(f35.getType(f35));
    System.out.println();

    System.out.println(f16.getStatus(f16));
    System.out.println(f35.getStatus(f35));
    System.out.println();

    if (f16.isPriority(f16)) {
      System.out.println(f16.type + " does not have priority in the ammo fill queue.");
    }
    if (f35.isPriority(f35)) {
      System.out.println(f35.type + " has the top priority in the ammo fill queue.");
    }
  }
}
