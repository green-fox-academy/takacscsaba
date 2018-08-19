import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> crew;
  Pirate captain;
  String shipName;
  boolean loserShip = false;

  public Ship(String name) {
    shipName = name;
    captain = new Pirate();
    crew = new ArrayList<>();
  }

  public void fillShip() {
    for (int i = 0; i < (int) (Math.random() * 10) + 1; i++) {
      crew.add(new Pirate());
    }
  }

  public void status() {
    System.out.println(shipName);
    System.out.print("Captain has drunk " + captain.intoxication + " bottle of rum. He's");
    System.out.println(captain.dead ? " dead." : captain.passedOut ? " passed out." : " fine.");


    System.out.println("The ship has " + aliveCrew() + " number of crew.");
  }

  public int aliveCrew() {
    int aliveCrewNum = 0;
    for (int i = 0; i < crew.size(); i++) {
      if (!crew.get(i).dead) {
        aliveCrewNum++;
      }
    }
    return aliveCrewNum;
  }

  public boolean battle(Ship otherShip) {
    int scoreShip1 = aliveCrew() - captain.intoxication;
    int scoreShip2 = otherShip.aliveCrew() - otherShip.captain.intoxication;
    if (scoreShip1 > scoreShip2) {
      win();
      otherShip.lose();
      return true;
    } else {
      lose();
      otherShip.win();
      return false;
    }
  }

  public void win() {
    for (int i = 0; i < Math.random() * 3; i++) {
      captain.drinkSumRum();
    }
    for (int i = 0; i < crew.size(); i++) {
      for (int j = 0; j < Math.random() * 3; j++) {
        crew.get(i).drinkSumRum();
      }
    }
  }

  public void lose() {
    for (int i = 0; i < crew.size(); i++) {
      if (Math.random() > 0.5) {
        crew.get(i).die();
      }
    }
    loserShip = true;
  }
}