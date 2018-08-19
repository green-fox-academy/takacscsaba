import java.util.List;

public class Armada {
  List<Ship> armada;

  public void fillArmada(String armadaName) {
    for (int i = 0; i < (int) (Math.random() * 5) + 1; i++) {
      armada.add(new Ship(armadaName + (i + 1)));
    }
  }

  public boolean hasNotLost() {
    int loserShipCount = 0;
    for (int i = 0; i < armada.size(); i++) {
      if (armada.get(i).loserShip) {
        loserShipCount++;
      }
    }
    return loserShipCount == armada.size();
  }

  public boolean war(Armada otherArmada) {
    while (otherArmada.hasNotLost()) {
      for (int i = 0; i < armada.size(); i++) {
        for (int j = 0; j < otherArmada.armada.size(); j++) {
          if (!otherArmada.armada.get(j).loserShip) {
            armada.get(i).battle(otherArmada.armada.get(j));
          }
        }
      }
    }
    return hasNotLost();
  }
}

//  Contains Ship-s as a list
//    Have a armada.war(otherArmada) method where two armada can engage in war
//    it should work like merge sort
//    first ship from the first armada battles the first of the other
//    the loser gets skipped so the next ship comes in play from that armada
//    whichever armada gets to the end of its ships loses the war
//    return true if this is the winner