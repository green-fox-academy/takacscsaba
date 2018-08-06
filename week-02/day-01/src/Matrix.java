public class Matrix {
  public static void main(String[] args) {
    int[][] arr = new int[4][4];

    array(arr);
    int[][] arr2 = array(arr);

    for (int row = 0; row < arr2.length; row++) {
      for (int column = 0; column < arr2[row].length; column++) {
        System.out.print(arr2[row][column] + " ");
      }
      System.out.println();
    }

  }

  public static int[][] array(int arr[][]) {

    for (int i = 0; i < arr.length; i++) {
      arr[i][i] = 1;
    }
    return arr;
  }
}
    /*   int[][] arr = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};


    for (int row = 0; row < arr.length; row++) {
      for (int column = 0; column < arr[row].length; column++) {
        System.out.print(arr[row][column] + " ");
      }
      System.out.println();
    }*/
