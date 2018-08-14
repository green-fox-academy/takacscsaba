import java.util.ArrayList;
import java.util.Arrays;

public class SymmetricMatrix {

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> symmetricMatrix = new ArrayList<ArrayList<Integer>>();
    symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1)));
    symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(0, 2, 2)));
    symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(1, 2, 5)));

    System.out.println(isSymmetric(symmetricMatrix));
  }

  public static boolean isSymmetric(ArrayList<ArrayList<Integer>> m) {

    for (int row = 0; row < m.size(); row++) {
      if (m.size() != m.get(row).size()) {
        return false;
      }
      for (int column = row + 1; column < m.size(); column++) {
        if (m.get(row).get(column) != m.get(column).get(row)) {
          return false;
        }
      }
    }
    return true;
  }
}
//   Create a function named `isSymmetric` that takes an n×n integer matrix (list of lists) as parameter
//   and returns true, if is that matrix is symmetric (diagonally from top-left to bottom-right)
//   or false if it is not
//
//   example for symmetric matrix:
//   1 0 1
//   0 2 2
//   1 2 5
//
//   example for not symmetric matrix
//   7 7 7
//   6 5 7
//   1 2 1
//
//  ArrayList<ArrayList<Integer>> symmetricMatrix = new ArrayList<ArrayList<Integer>>();
//
//    symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(1, 0, 1)));
//    symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(0, 2, 2)));
//    symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(1, 2, 5)));
//
//    System.out.println(isSymmetric(symmetricMatrix)); // should print out true
