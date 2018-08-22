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
    Carrier infernus = new Carrier("Infernus", 2300, 5000);
    Carrier blizzardo = new Carrier("Blizzardo", 2800, 5500);

    infernus.add();
    infernus.fill();
    System.out.println();
    blizzardo.add2();
    blizzardo.fill();
    System.out.println();

    infernus.fight(blizzardo);

  }
}
