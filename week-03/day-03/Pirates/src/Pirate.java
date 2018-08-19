public class Pirate {
  int intoxication = 0;
  boolean passedOut = false;
  boolean dead = false;

  public void drinkSumRum() {
    if (dead) {
      System.out.println("He's dead");
    } else if (intoxication > 5) {
      intoxication++;
      passOut();
    } else {
      intoxication++;
    }
  }

  public void howsItGoingMate() {
    if (dead) {
      System.out.println("He's dead");
    } else if (intoxication < 5) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      passOut();
    }
  }

  public void die() {
    dead = true;
  }

  public void passOut() {
    passedOut = true;
  }

  public void brawl(Pirate x) {
    int chanceToDie = (int) (Math.random() * 3) + 1;
    switch (chanceToDie) {
      case 1:
        this.die();
        break;
      case 2:
        x.die();
        break;
      case 3:
        this.passOut();
        x.passOut();
        break;
    }
  }
}
