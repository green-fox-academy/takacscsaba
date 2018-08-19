public class BattleApp {
  public static void main(String[] args) {
    Ship EzerEvesSolyom = new Ship("EzerEvesSolyom");
    Ship Enterprise = new Ship("Enterprise");

    EzerEvesSolyom.fillShip();
    EzerEvesSolyom.status();

    Enterprise.fillShip();
    Enterprise.status();

    EzerEvesSolyom.battle(Enterprise);

    EzerEvesSolyom.status();
    Enterprise.status();
  }
}

//BattleApp
//    Create a BattleApp class with a main method
//    Create 2 ships, fill them with pirates
//    Have a battle!