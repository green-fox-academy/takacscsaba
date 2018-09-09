package main.java.foxes;

import java.util.ArrayList;
import java.util.List;
//    Write a Stream Expression to find the foxes with green color! Write a Stream Expression to find the foxes with green color and pallida type!

public class Main {
  public static void main(String[] args) {
    List<Fox> foxList = new ArrayList<>();
    foxList.add(new Fox("RokaUr", "pallida", "green"));
    foxList.add(new Fox("RokaKoma", "foxer", "red"));
    foxList.add(new Fox("RavaszRoka", "focks", "black"));
    foxList.add(new Fox("RoKalapos", "pallida", "green"));
    foxList.add(new Fox("RoKalander", "forox", "white"));
    foxList.add(new Fox("RoKapuska", "fogox", "green"));

    System.out.println("Green foxes (with stream):");
    foxList.stream()
        .filter(x -> "green".equals(x.color))
        .forEach(System.out::println);

    System.out.println("\nGreen and pallida foxes (with stream):");
    foxList.stream()
        .filter(x -> x.color.equals("green") && x.type.equals("pallida"))
        .forEach(System.out::println);

    System.out.println("\nGreen foxes (with method):");
    for (int i = 0; i < greenFoxesMethod(foxList).size(); i++) {
      System.out.println(greenFoxesMethod(foxList).get(i).toString());
    }

    System.out.println("\nGreen and pallida foxes (with method):");
    for (int i = 0; i < greenPallidaFoxesMethod(foxList).size(); i++) {
      System.out.println(greenPallidaFoxesMethod(foxList).get(i).toString());
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

  public static List<Fox> greenPallidaFoxesMethod(List<Fox> foxList) {
    List<Fox> greenPallidaFoxList = new ArrayList<>();
    for (int i = 0; i < foxList.size(); i++) {
      if (foxList.get(i).color == "green" && foxList.get(i).type == "pallida") {
        greenPallidaFoxList.add(foxList.get(i));
      }
    }
    return greenPallidaFoxList;
  }
}
