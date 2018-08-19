import java.util.ArrayList;
import java.util.List;

public class Armada {
  List<Ship> armadaList;
  String armadaName;

  public Armada(String name) {
    armadaName = name;
    armadaList = new ArrayList<>();
  }

  public void fillArmada() {
    for (int i = 0; i < (int) (Math.random() * 5) + 1; i++) {
      armadaList.add(new Ship(armadaName + (i + 1)));
      armadaList.get(i).fillShip();
    }
  }

  public void statusArmada() {
    System.out.println("The " + armadaName + " contains " + armadaList.size() + " ships.");
    for (int i = 0; i < armadaList.size(); i++) {
      armadaList.get(i).status();
      System.out.println();
    }
  }

  public boolean hasNotLost() {
    int loserShipCount = 0;
    for (int i = 0; i < armadaList.size(); i++) {
      if (armadaList.get(i).loserShip) {
        loserShipCount++;
      }
    }
    return loserShipCount != armadaList.size();
  }

  public boolean war(Armada otherArmada) {
    System.out.println(otherArmada.hasNotLost());
    while (otherArmada.hasNotLost()) {
      for (int i = 0; i < armadaList.size(); i++) {
        for (int j = 0; j < otherArmada.armadaList.size(); j++) {
          if (!otherArmada.armadaList.get(j).loserShip) {
            armadaList.get(i).battle(otherArmada.armadaList.get(j));
          }
        }
      }
    }
    return hasNotLost();
  }
}