import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    //Aircrafts created
    Aircraft f16 = new F16();
    Aircraft f35 = new F35();

    //Aircrafts filled
    f16.refill(300);
    System.out.println(f16.ammo);
    f35.refill(300);
    System.out.println(f35.ammo);
    System.out.println();

    //Aircrafts status
    System.out.println(f16.getStatus());
    System.out.println(f35.getStatus());
    System.out.println();

    //Aircrafts fight
    f16.fight();
    f35.fight();
    System.out.println(f16.ammo);
    System.out.println(f35.ammo);
    System.out.println();

    //Aircrafts types
    System.out.println(f16.getType());
    System.out.println(f35.getType());
    System.out.println();

    //Aircrafts statuses
    System.out.println(f16.getStatus());
    System.out.println(f35.getStatus());
    System.out.println();

    //Carriers created
    Carrier infernus = new Carrier("Infernus", 2300, 5000);
    Carrier blizzardo = new Carrier("Blizzardo", 2800, 1500);

    //Carriers filled with aircrafts and aircrafts filled with fuel
    infernus.add();
    infernus.fill();
    System.out.println();
    blizzardo.add2();
    blizzardo.fill();
    System.out.println();

    //Carriers fight and statuses
    infernus.fight(blizzardo);
    System.out.println();
    System.out.println(infernus.getStatus());
    System.out.println();
    System.out.println(blizzardo.getStatus());

  }
}
