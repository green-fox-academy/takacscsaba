public class Main {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    Thing milk = new Thing("Get milk");
    Thing obstacles = new Thing("Remove the obstacles");
    Thing standUp = new Thing("standUp");
    Thing eat = new Thing("Eat lunch");

    standUp.complete();
    eat.complete();
    fleet.add(milk);
    fleet.add(obstacles);
    fleet.add(standUp);
    fleet.add(eat);

    System.out.println(fleet);
  }
}

