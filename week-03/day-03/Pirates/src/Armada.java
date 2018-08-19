import java.util.List;

public class Armada {
  List<Ship> armada;

  public void fillArmada(String armadaName) {
    for (int i = 0; i < (int) (Math.random() * 5) + 1; i++) {
      armada.add(new Ship(armadaName + (i + 1)));
    }
  }

  public boolean war(Armada otherArmada) {


  }
}

//  Contains Ship-s as a list
//    Have a armada.war(otherArmada) method where two armada can engage in war
//    it should work like merge sort
//    first ship from the first armada battles the first of the other
//    the loser gets skipped so the next ship comes in play from that armada
//    whichever armada gets to the end of its ships loses the war
//    return true if this is the winner