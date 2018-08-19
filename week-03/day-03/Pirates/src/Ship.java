import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> crew;
  Pirate captain;

  public void fillShip() {
    captain = new Pirate();
    crew = new ArrayList<>();

    for (int i = 0; i < (int) (Math.random() * 6) + 1; i++) {
      crew.add(new Pirate());
    }
  }

  public void status() {
    System.out.print("Captain has drunk " + captain.intoxication + " bottle of rum. He is ");
    System.out.println(captain.dead ? " dead." : captain.passedOut ? " passed out." : " fine.");


    System.out.println("The number of alive pirates is: " + aliveCrew() + ".");
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
    
  }
}


//    Ships should have a method to battle other ships: ship.battle(otherShip)
//    should return true if the actual ship (this) wins
//    the ship should win if its calculated score is higher
//    calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
//    The loser crew has a random number of losses (deaths).
//    The winner captain and crew has a party, including a random number of rum :)