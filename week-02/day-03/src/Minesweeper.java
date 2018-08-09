import java.util.Random;
import java.util.Scanner;

public class Minesweeper {

  static int[][] GAME_STATE = new int[10][10];
  static int MINE = 1;
  static int REVEALED = 2;
  static int NOT_REVEALED = 0;
  static String COLUMNS = "abcdefghij";

  public static void main(String[] args) {
    generateMap();
    while (true) {
      printGameTable();
      if (winning()) {
        System.out.println("You're winner.");
        break;
      }
      Scanner scanner = new Scanner(System.in);
      System.out.println("Okay, what is your guess?");
      String guess = scanner.nextLine();

      int row = getRow(guess);
      int column = getColumn(guess);
      if (GAME_STATE[row][column] == MINE) {
        System.out.println("You died, sorry.");
        break;
      } else {
        reveal(row, column);
      }
    }
  }

  static void reveal(int row, int column) {
    GAME_STATE[row][column] = 2;
    if (getNeighbours(row, column) == 0) {
      if (row > 0 && GAME_STATE[row - 1][column] == NOT_REVEALED)
        reveal(row - 1, column);
      if (row < 9 && GAME_STATE[row + 1][column] == NOT_REVEALED)
        reveal(row + 1, column);
      if (column > 0 && GAME_STATE[row][column - 1] == NOT_REVEALED)
        reveal(row, column - 1);
      if (column < 9 && GAME_STATE[row][column + 1] == NOT_REVEALED)
        reveal(row, column + 1);
      if (row > 0 && column > 0 && GAME_STATE[row - 1][column - 1] == NOT_REVEALED)
        reveal(row - 1, column - 1);
      if (row > 0 && column < 9 && GAME_STATE[row - 1][column + 1] == NOT_REVEALED)
        reveal(row - 1, column + 1);
      if (row < 9 && column > 0 && GAME_STATE[row + 1][column - 1] == NOT_REVEALED)
        reveal(row + 1, column - 1);
      if (row < 9 && column < 9 && GAME_STATE[row + 1][column + 1] == NOT_REVEALED)
        reveal(row + 1, column + 1);
    }
  }

  private static boolean winning() {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; i++) {
        if (GAME_STATE[i][j] == NOT_REVEALED) {
          return false;
        }
      }
    }
    return true;
  }

  static int getNeighbours(int row, int column) {
    int counter = 0;
    if (row > 0 && GAME_STATE[row - 1][column] == MINE)
      counter++;
    if (row < 9 && GAME_STATE[row + 1][column] == MINE)
      counter++;
    if (column > 0 && GAME_STATE[row][column - 1] == MINE)
      counter++;
    if (column < 9 && GAME_STATE[row][column + 1] == MINE)
      counter++;
    if (row > 0 && column > 0 && GAME_STATE[row - 1][column - 1] == MINE)
      counter++;
    if (row > 0 && column < 9 && GAME_STATE[row - 1][column + 1] == MINE)
      counter++;
    if (row < 9 && column > 0 && GAME_STATE[row + 1][column - 1] == MINE)
      counter++;
    if (row < 9 && column < 9 && GAME_STATE[row + 1][column + 1] == MINE)
      counter++;
    return counter;
  }

  static int getRow(String guess) {
    return Integer.valueOf(guess.substring(1));
  }

  static int getColumn(String guess) {
    return COLUMNS.indexOf(guess.substring(0, 1));
  }

  private static void printGameTable() {
    System.out.println(" " + COLUMNS);

    for (int i = 0; i < 10; i++) {
      System.out.print(i);
      for (int j = 0; j < 10; j++) {
        if (GAME_STATE[i][j] == REVEALED) {
          System.out.print(getNeighbours(i, j));
        } else {
          System.out.print("#");
        }
      }
      System.out.println();
    }
  }

  static void generateMap() {
    Random random = new Random();
    for (int i = 0; i < 7; ) {
      int x = random.nextInt(10);
      int y = random.nextInt(10);
      if (GAME_STATE[x][y] != MINE) {
        GAME_STATE[x][y] = MINE;
        i++;
      }
      GAME_STATE[x][y] = 1;
    }
  }
}