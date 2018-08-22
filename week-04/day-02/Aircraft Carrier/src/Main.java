import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
//    Carrier carrier = new Carrier("Infernus",2300, 5000);

    Aircraft f16 = new Aircraft("F16", 8, 30, 0);
    Aircraft f35 = new Aircraft("F35", 12, 50, 0);

    f16.refill(300);
    System.out.println(f16.ammo);
    f35.refill(300);
    System.out.println(f35.ammo);
    System.out.println();

    System.out.println(f16.getStatus());
    System.out.println(f35.getStatus());
    System.out.println();

    f16.fight(f35);
    System.out.println(f16.ammo);
    System.out.println(f35.ammo);
    System.out.println();

    System.out.println(f16.getType());
    System.out.println(f35.getType());
    System.out.println();

    System.out.println(f16.getStatus());
    System.out.println(f35.getStatus());
    System.out.println();

//    carrier.add();
//    carrier.fill();
  }
}
