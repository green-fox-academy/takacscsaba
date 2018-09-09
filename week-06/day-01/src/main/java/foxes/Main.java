package main.java.foxes;

import java.util.ArrayList;
import java.util.List;
//    Write a Stream Expression to find the foxes with green color! Write a Stream Expression to find the foxes with green color and pallida type!

public class Main {
  public static void main(String[] args) {
    List<Fox> foxList = new ArrayList<>();
    foxList.add(new Fox("RokaUr", "foxyfox", "green"));
    foxList.add(new Fox("RokaKoma", "foxer", "red"));
    foxList.add(new Fox("RavaszRoka", "focks", "black"));
    foxList.add(new Fox("RoKalapos", "pallida", "green"));
    foxList.add(new Fox("RoKalander", "forox", "white"));
    foxList.add(new Fox("RoKapuska", "fogox", "green"));


    for (int i = 0; i < greenFoxesMethod(foxList).size(); i++) {
      System.out.println(greenFoxesMethod(foxList).toString());
    }
  }

  public static List<Fox> greenFoxesMethod(List<Fox> foxList) {
    List<Fox> greenFoxList = new ArrayList<>();
    for (int i = 0; i < foxList.size(); i++) {
      if (foxList.get(i).color == "green") {
        greenFoxList.add(foxList.get(i));
      }
    }
    return greenFoxList;
  }
}
