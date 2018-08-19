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