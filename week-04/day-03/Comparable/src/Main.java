import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();

    List<Domino> snakeDomino = new ArrayList<>();
    snakeDomino.add(dominoes.get(0));

    for (int i = 0; i < dominoes.size(); i++) {
      for (int j = 0; j < dominoes.size(); j++) {
        int[] x = dominoes.get(j).getValues(0);
        int[] y = snakeDomino.get(snakeDomino.size() - 1).getValues(1);

        if (!snakeDomino.contains(dominoes.get(j)) &&
            y[1] == x[0]) {
          snakeDomino.add(dominoes.get(j));
        }
      }
    }
//    System.out.println(dominoes);
//    System.out.println(snakeDomino);

    System.out.println(dominoes);
    Collections.sort(dominoes);
    System.out.println(dominoes);
    System.out.println(snakeDomino);

    for (int i = 0; i < dominoes.size(); i++) {
      System.out.println(dominoes.get(i).compareTo(snakeDomino.get(i)));
    }
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}