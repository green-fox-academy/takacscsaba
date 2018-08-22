import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    //Aircraft
//    Aircraft f16 = new F16();
//    Aircraft f35 = new F35();
//
//    f16.refill(300);
//    System.out.println(f16.ammo);
//    f35.refill(300);
//    System.out.println(f35.ammo);
//    System.out.println();
//
//    System.out.println(f16.getStatus());
//    System.out.println(f35.getStatus());
//    System.out.println();
//
//    f16.fight(f35);
//    System.out.println(f16.ammo);
//    System.out.println(f35.ammo);
//    System.out.println();
//
//    System.out.println(f16.getType());
//    System.out.println(f35.getType());
//    System.out.println();
//
//    System.out.println(f16.getStatus());
//    System.out.println(f35.getStatus());
//    System.out.println();

    //Carrier
    Carrier carrier = new Carrier("Infernus", 2300, 5000);
    carrier.add();
    carrier.fill();
  }
}
